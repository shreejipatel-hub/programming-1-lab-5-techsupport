TechSupport - the DodgySoft Technical support system, version #2.

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling

This project is discussed in chapter 6.


This project implements a second version of the technical support system 
example. It is an intermediate version intended to demonstrate the first
few changes discussed in this book chapter.


To start this program, create a SupportSystem object and execute the "start" 
method.

Then start describing your problem by typing in the terminal window.


24)It has a key and a value it associates the key to the value.
26)we check the entries by using size()
28)it will replace the old value.
29) it will be counted as 2 diffrent values
30)containsKey(Object key)
31)the get methode will return null as an answer
32)for (String name : phoneBook.keySet())
    {
        System.out.println("Key: " + name);
    }
34)similarities(both are used to store a collection of objects)
    diffrences
    arraylist(the elements are accessed by index)
    hashset(must contain unique elements, is backed by hash table)
35)the order in hashset will contain only unique word and cant be predictable
    in arraylist everything will be returned doesnt matter if its 
    a duplicate and it will be printed in order.
36)yes it is a problem because now we just have an extra empty string 
43)the putIfAbsent method is supposed to add a new key-value pair
    if and only if its not already present.
44)public void printWordCounts()
    {
        System.out.println("\n--- Word Usage Summary ---");
        for(Map.Entry<String, Integer> entry : counts.entrySet())
        {
            String word = entry.getKey();
            Integer count = entry.getValue();
            System.out.println("'"+word+"':"+count);
        }
        System.out.println("----------------");
    }
45)public HashMap<String, String> getResponseMap()
    {
        return responseMap;
    }
    
    public void printFilteredWordCounts(HashMap<String, String>knownWordsMap)
    {
        System.out.println("\n--- Unknown Word Usage Summary ---");
        
        for(java.util.Map.Entry<String, Integer>entry: counts.entrySet())
        {
            String word = entry.getKey();
            Integer count = entry.getValue();
            if(!knownWordsMap.containsKey(word))
            {
                System.out.println("'"+word+"':"+counts);
            }
        }
        System.out.println("----------------");
    }
47)@author tag(makrs the creators of th class)
    @ version tag (give the current version of the code)
    @param tag(describes oen of the parameters that a method accepts)
    @return tag(describes the value that method sends back)
    
48)@since tag(indicates the version of the product where the elemnt was first added or became avalaible)
    @see tag (adds a "see also" link to other related documentation)
    @@throws tag (documents an exception that the method might throw)

