package com.dailycodebuffer.springbootdemo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.springbootdemo.entity.JournalEntry;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/journal")
public class JournalEntryController {

          public Map<Long,JournalEntry> journalEntries = new HashMap<>();
         
          @GetMapping
          public List<JournalEntry> getAllJournalEntries() {
                    return new ArrayList<>(journalEntries.values());
          }

          @PostMapping
          public boolean createEntry(@RequestBody JournalEntry entity) {
                    journalEntries.put(entity.getId(), entity);
                    return true;
          }

          @GetMapping("id/{myId}")
          public JournalEntry getJournalEntryById(@PathVariable Long myId) {
                    return journalEntries.get(myId);
          }

          @DeleteMapping("id/{myId}")
          public boolean deleteEntryById(@PathVariable Long myId) {
                    journalEntries.remove(myId);
                    return true;
          }
          @PutMapping("id/{myId}")
          public JournalEntry updaEntryById(@PathVariable Long myId, @RequestBody JournalEntry entity) {
                    journalEntries.put(myId, entity);
                    return journalEntries.get(myId);
          }

          
}
