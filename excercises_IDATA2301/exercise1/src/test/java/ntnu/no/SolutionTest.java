package ntnu.no;

public class SolutionTest {
    
    @Test
    public void testIsValidUsername() {
        Solution solution = new Solution();
        assertFalse(solution.isValidUsername("Julia"));
        assertTrue(solution.isValidUsername("Samantha"));
        assertTrue(solution.isValidUsername("Samantha_21"));
        assertFalse(solution.isValidUsername("1Samantha"));
        assertFalse(solution.isValidUsername("Samantha?10_2A"));
    }
}
