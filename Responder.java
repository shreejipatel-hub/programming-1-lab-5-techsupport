import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * The responder class represents a response generator object. It is used
 * to generate an automatic response. This is the second version of this 
 * class. This time, we generate some random behavior by randomly selecting 
 * a phrase from a predefined list of responses.
 * 
 * @author   Michael Kölling and David J. Barnes
 * @version 7.2
 */
public class Responder
{
    private Random randomGenerator;
    private HashMap<String,String> responsesmap;
    private ArrayList<String> defaultResponses;
    private int lastDefaultIndex;
    /**
     * Construct a Responder
     */
    public Responder()
    {
        randomGenerator = new Random();
        responsesmap = new HashMap<String,String>();
        defaultResponses = new ArrayList<String>();
        fillResponsesmap();
        fillDefaultResponses();
        lastDefaultIndex = -1;
    }

    /**
     * Generate a response.
     * 
     * @return  A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String>words)
    {
        // Pick a random number for the index in the default response 
        // list. The number will be between 0 (inclusive) and the size
        // of the list (exclusive).
        
        for (String word : words)
        {
            String response = responsesmap.get(word);
            if (response != null)
            {
                return response;
            }
        }        
        return pickDefaultResponse(); 
    }

    /**
     * Build up a list of default responses from which we can pick one
     * if we don't know what else to say.
     */
    private void fillResponsesmap()
    {
        responsesmap.put("crash", "Have you checked the memory usage and closed unnecessary programs?");
        responsesmap.put("bug", "Could you describe the exact steps to reproduce the bug?");
        responsesmap.put("slow", "Try closing other applications to free up resources.");
        responsesmap.put("display", "Ensure your graphics drivers are up to date.");
        responsesmap.put("error", "Please tell me the exact error code.");
        responsesmap.put("install", "Did you run the setup file as an administrator?");
        responsesmap.put("login", "Are you sure you're using the correct username and password?");
        responsesmap.put("freeze", "A temporary freeze might be fixed by closing all browser windows.");
        responsesmap.put("update", "Did you receive any error messages during the last update attempt?");
        responsesmap.put("sound", "Check that your audio cables are securely plugged in and not damaged.");
        responsesmap.put("internet", "Is your modem showing a stable connection light, or is it blinking?");
        responsesmap.put("password", "Have you tried resetting your password using the 'forgot password' link?");
    }
    
    private void fillDefaultResponses()
    {
        defaultResponses.add("That sounds odd. Could you describe this in more detail?");
        defaultResponses.add("No other customer has ever complained about this before. What is your system configuration?");
        defaultResponses.add("I need a bit more information on that.");
        defaultResponses.add("Have you checked that you do not have a dll conflict?");
        defaultResponses.add("That is covered in the manual. Have you read the manual?");
        defaultResponses.add("Your description is a bit wishy-washy. Have you got a concrete example?");
    }
    
    private String pickDefaultResponse()
    {
        int newIndex;
        do
        {
            newIndex = randomGenerator.nextInt(defaultResponses.size());
        }
        while(newIndex == lastDefaultIndex)  ;
        lastDefaultIndex = newIndex;
        
        return defaultResponses.get(newIndex);
    }
}

