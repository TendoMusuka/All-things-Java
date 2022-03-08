public class FixedArrays {
    public static void main(String[] args) {
        String[] group = new String[] {"Sam", "Noah", "Liam"};
        String [] newGroup = new String[4];
        for (int i = 0; i < group.length; i++) {
            newGroup[i] = group[i];
        }
        newGroup[3] = "Katie";
    }
}
