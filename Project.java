public class Project {

    /**
     * @autor lwagen2s
     */

    String[][] s_Ausgang;

    public Project(String[][] s_Ausgang) {
        this.s_Ausgang = s_Ausgang;
    }

    public boolean isWellSorted(String[] sequence) {
        boolean first_in;
        boolean ergebnis = false;
        int count = 0;

        for(int i = 0; i < s_Ausgang.length; i++) {
            first_in = false;
            if(s_Ausgang[i][0] == s_Ausgang[i][1]) return false;
            for(int j = 0; j < sequence.length; j++) {
                if(sequence[j] == s_Ausgang[i][0]) {
                    if(j < sequence.length-1) {
                        first_in = true;
                        j++;
                    } else {
                        return false;
                    }

                }
                if(sequence[j] == s_Ausgang[i][1]) {
                    if(first_in == false) {
                        return false;
                    } else {
                        ergebnis = true;
                        count++;
                    }
                }
            }
        }
        if(count >= s_Ausgang.length) {
            return ergebnis;
        }
        return false;
    }
}
