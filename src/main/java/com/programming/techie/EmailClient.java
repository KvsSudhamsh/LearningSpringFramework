package com.programming.techie;

class EmailClient {
    private SpellChecker spellChecker;

    EmailClient(com.programming.techie.BasicSpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }
    EmailClient(com.programming.techie.AdvancedSpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }
    void sendEmail(String emailMessage) {
        spellChecker.checkSpelling(emailMessage);
        // Logic to Send Email
    }
}
