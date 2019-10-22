package com.zrq.controller;

import com.zrq.entity.TagDict;
import com.zrq.service.ITagDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tagdict")
public class TagDictController {

    @Autowired
    private ITagDictService tagDictService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<TagDict> findAll(){
        return tagDictService.findAll();
    }

    @RequestMapping("/deleteTagDictOne")
    public int deleteTagDictOne(String tagDictId){
        return tagDictService.deleteByKey(tagDictId);
    }

    @RequestMapping("/deleteTagDict")
    public int deleteTagDict(String tagDictId){
        return tagDictService.deleteTagDict(tagDictId);
    }
}
