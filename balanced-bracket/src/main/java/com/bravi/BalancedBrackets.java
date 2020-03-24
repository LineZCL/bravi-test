package com.bravi;

import java.util.*;

public class BalancedBrackets {
    //Relation with open and close brackets
    private HashMap<Character, Character> brackets;
    private List<Character> openBrackets;

    public BalancedBrackets(){
        brackets = new HashMap<>();
        brackets.put('{', '}');
        brackets.put('(', ')');
        brackets.put('[', ']');


    }
    public boolean isBalancedBrackets(String bracketsStr){
        openBrackets = new ArrayList<>();
        for(int i = 0; i < bracketsStr.length(); i++){
            char bracket = bracketsStr.charAt(i);
            if(isOpenBracket(bracketsStr.charAt(i)))
                openBrackets.add(bracket);
            else{
                int lastPosition = openBrackets.size() - 1;
                if(isMatchBracket(openBrackets.get(lastPosition), bracket))
                    openBrackets.remove(lastPosition);
                else
                    return false;

            }
        }
        return openBrackets.size() == 0;
    }

    private boolean isMatchBracket(char openBracket, char endBracket){
        return brackets.get(openBracket) == endBracket;
    }

    private boolean isOpenBracket(char bracket){
        return brackets.containsKey(bracket);
    }
}
