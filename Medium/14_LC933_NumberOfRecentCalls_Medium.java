import java.util.ArrayList;

class RecentCounter {

    ArrayList<Integer> list = new ArrayList<>();

    public RecentCounter() {

    }

    public int ping(int t) {

        list.add(t);

        int count = 0;

        for (int time : list) {
            if (time >= t - 3000) {
                count++;
            }
        }

        return count;
    }
}
