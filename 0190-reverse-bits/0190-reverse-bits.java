public class Solution {
    // you need to treat n as an unsigned value
    public int reverseBits(int n) {
        String binary = Integer.toBinaryString(n);
        
        // Pad to 32 bits
        while (binary.length() < 32) {
            binary = "0" + binary;
        }

        // Reverse the 32-bit binary string
        StringBuilder sb = new StringBuilder(binary);
        sb.reverse();

        // Convert reversed binary string back to int (unsigned)
        return (int) Long.parseLong(sb.toString(), 2);  // use Long to avoid overflow
    }
}
