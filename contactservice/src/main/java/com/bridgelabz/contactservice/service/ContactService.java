package com.bridgelabz.contactservice.service;

import com.bridgelabz.contactservice.entity.Contact;

import java.util.List;

public interface ContactService {

public List <Contact> getContactsOfUser(Long userId);

}
