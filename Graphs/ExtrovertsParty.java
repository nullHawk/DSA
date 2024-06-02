public class ExtrovertsParty {
    //Only the people who can bring at least K friends can join the party. COunt no. of attendees.
    public int getAttendees(int n, int k, int[] a, int[] b){
        int[] friends = new int[n];
        for(int i = 0; i < a.length; i++){
            friends[a[i]]++;
            friends[b[i]]++;
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            if(friends[i] >= k){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        ExtrovertsParty ep = new ExtrovertsParty();
        int n = 5;
        int k = 2;
        int[] a = {0, 0, 1, 1, 2};
        int[] b = {1, 2, 2, 3, 3};
        System.out.println(ep.getAttendees(n, k, a, b));
    }
    
}
