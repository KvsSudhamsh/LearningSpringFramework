package com.programming.techie;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
class BasicSpellChecker implements SpellChecker {
    public void checkSpelling(String emailMessage) {

        try {
            if (emailMessage != null) {
                System.out.println("Checking spelling using Basic Spell Checker...");
                System.out.println("Spell Checking Completed!!");
            } else {
                throw new NullPointerException("Email message is null");
            }
        } catch (Exception e) {
            System.out.println("An exception occurred while checking Spelling: " + e.getMessage());
            // You can handle the exception here or rethrow it if needed
            throw e;
        }
    }
}
