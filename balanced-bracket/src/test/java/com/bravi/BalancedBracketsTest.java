package com.bravi;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BalancedBracketsTest {

    private BalancedBrackets balancedBrackets;

    @Before
    public void init(){
        balancedBrackets = new BalancedBrackets();
    }

    @Test
    public void testIsBalancedBracketsWithLetterCharacterReturnFalse(){
        assertFalse(balancedBrackets.isBalancedBrackets("{a}"));
    }

    @Test
    public void testIsBalancedBracketsWithParenthesisNotCloseReturnFalse(){
        assertFalse(balancedBrackets.isBalancedBrackets("("));
    }

    @Test
    public void testIsBalancedBracketsWithParenthesisReturnTrue(){
        assertTrue(balancedBrackets.isBalancedBrackets("()"));
    }

    @Test
    public void testIsBalancedBracketsWithBracesNotCloseReturnFalse(){
        assertFalse(balancedBrackets.isBalancedBrackets("{"));
    }
    @Test
    public void testIsBalancedBracketsWithBracesReturnTrue(){
        assertTrue(balancedBrackets.isBalancedBrackets("{}"));
    }
    @Test
    public void testIsBalancedBracketsWithBracketsNotCloseReturnFalse(){
        assertFalse(balancedBrackets.isBalancedBrackets("["));
    }
    @Test
    public void testIsBalancedBracketsWithBracketsReturnTrue(){
        assertTrue(balancedBrackets.isBalancedBrackets("[]"));
    }

    @Test
    public void testIsBalancedBracketsWithBracketsMixedAndCloseErrorReturnFalse(){
        assertFalse(balancedBrackets.isBalancedBrackets("[({{)}]"));
    }

    @Test
    public void testIsBalancedBracketsWithBracketsMixedAndCloseRightReturnTrue(){
        assertTrue(balancedBrackets.isBalancedBrackets("[{}({})]"));
    }

}
