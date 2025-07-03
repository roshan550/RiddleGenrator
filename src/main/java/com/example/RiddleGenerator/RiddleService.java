package com.example.RiddleGenerator;

import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class RiddleService {
    private final List<Riddle> riddles = Arrays.asList(
        // English Riddles
        new Riddle("What has keys but can't open locks?", "A piano.", "en"),
        new Riddle("What has a heart that doesn't beat?", "An artichoke.", "en"),
        new Riddle("What has to be broken before you can use it?", "An egg.", "en"),
        new Riddle("I'm tall when I'm young, and I'm short when I'm old. What am I?", "A candle.", "en"),
        new Riddle("What month of the year has 28 days?", "All of them.", "en"),
        new Riddle("What is full of holes but still holds water?", "A sponge.", "en"),
        new Riddle("What question can you never answer yes to?", "Are you asleep yet?", "en"),
        new Riddle("What is always in front of you but can't be seen?", "The future.", "en"),
        new Riddle("There's a one-story house in which everything is yellow. What color are the stairs?", "There aren't any—it's a one-story house.", "en"),
        new Riddle("What can you break, even if you never pick it up or touch it?", "A promise.", "en"),
        new Riddle("What goes up but never comes down?", "Your age.", "en"),
        new Riddle("A man who was outside in the rain without an umbrella or hat didn't get a single hair on his head wet. Why?", "He was bald.", "en"),
        new Riddle("What gets wet while drying?", "A towel.", "en"),
        new Riddle("What can you keep after giving to someone?", "Your word.", "en"),
        new Riddle("I shave every day, but my beard stays the same. What am I?", "A barber.", "en"),
        // Hindi Riddles
        new Riddle("कौन सी चीज़ पानी में गिरते ही टूट जाती है?", "परछाई (Shadow)", "hi"),
        new Riddle("ऐसी कौन सी चीज़ है जो खाने के लिए खरीदी जाती है लेकिन खाई नहीं जाती?", "प्लेट (Plate)", "hi"),
        new Riddle("ऐसी कौन सी चीज़ है जो हर जगह है लेकिन दिखाई नहीं देती?", "हवा (Air)", "hi"),
        new Riddle("ऐसी कौन सी चीज़ है जो बिना पैर के चलती है?", "घड़ी (Clock)", "hi"),
        new Riddle("ऐसी कौन सी चीज़ है जो खुद तो जलती है लेकिन दूसरों को रोशनी देती है?", "मोमबत्ती (Candle)", "hi"),
        new Riddle("ऐसी कौन सी चीज़ है जो हमेशा बढ़ती जाती है लेकिन कभी कम नहीं होती?", "उम्र (Age)", "hi"),
        new Riddle("ऐसी कौन सी चीज़ है जो पानी में डूबती नहीं है?", "तेल (Oil)", "hi"),
        new Riddle("ऐसी कौन सी चीज़ है जो बिना बोले सब कुछ कह देती है?", "आँखें (Eyes)", "hi"),
        new Riddle("ऐसी कौन सी चीज़ है जो हर किसी के पास है लेकिन इस्तेमाल कोई और करता है?", "नाम (Name)", "hi"),
        new Riddle("ऐसी कौन सी चीज़ है जो दिन में एक बार आती है और रात में दो बार?", "'र' अक्षर (Letter 'R')", "hi"),
        new Riddle("ऐसी कौन सी चीज़ है जो बिना पंख के उड़ सकती है?", "धुआँ (Smoke)", "hi"),
        new Riddle("ऐसी कौन सी चीज़ है जो बिना पानी के उगती है?", "बाल (Hair)", "hi"),
        new Riddle("ऐसी कौन सी चीज़ है जो बिना आवाज़ के बोलती है?", "चिट्ठी (Letter)", "hi"),
        new Riddle("ऐसी कौन सी चीज़ है जो बिना देखे सब कुछ देख सकती है?", "आइना (Mirror)", "hi"),
        new Riddle("ऐसी कौन सी चीज़ है जो बिना हाथ के सबको पकड़ सकती है?", "नींद (Sleep)", "hi")
    );
    private final Random random = new Random();

    public Riddle getRandomRiddle(String language) {
        List<Riddle> filtered = riddles.stream()
            .filter(r -> r.getLanguage().equalsIgnoreCase(language))
            .toList();
        if (filtered.isEmpty()) return null;
        return filtered.get(random.nextInt(filtered.size()));
    }
} 