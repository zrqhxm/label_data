package com.zrq.controller;

import com.zrq.entity.Tag;
import com.zrq.service.ITagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/tag")
public class TagController {

    @Autowired
    private ITagService tagService;

    @RequestMapping("/findAll")
    public List<Tag> findAll(){
        return tagService.findAll();
    }

    @RequestMapping(value = "/addTag",method = RequestMethod.POST)
    public int addTag(@RequestBody Tag tag){
        tag.setCreateTime(new Date());
        tag.setUpdateTime(new Date());
        return tagService.insert(tag);
    }

    /**
     * 逻辑删除标签
     * @param id
     * @return
     */
    @RequestMapping("/deleteTag")
    public int deleteTag(String id){
       return tagService.deleteByKey(id);
    }
}
