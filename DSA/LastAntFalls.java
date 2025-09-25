class LastAntFalls 
{
    public int getLastMoment(int n, int[] left, int[] right)     // n = 4 => left = [2] => right = [0, 1, 3]
    {
        int maxTime = 0;                                         // tracks the longest time for any ant to fall

        for (int pos : left) 
        {
            maxTime = Math.max(maxTime, pos);                    // left[] => each ant falls at pos => the maximum
                                                                 // Left: [2] => time: 2
        }

        for (int pos : right)                                    
        {
            maxTime = Math.max(maxTime, n - pos);                // right[] => each ant falls at n - pos => the maximum
                                                                 // Right: [0 => 4], [1 => 3], [3 => 1]
        }

        return maxTime;                                          // maxTime = max(2, 4, 3, 1) = 4
    }

    public static void main(String[] args) {
        LastAntFalls obj = new LastAntFalls();

        int n1 = 4;
        int[] left1 = {2};
        int[] right1 = {0, 1, 3};
        System.out.println(obj.getLastMoment(n1, left1, right1));

        int n2 = 4;
        int[] left2 = {};
        int[] right2 = {0, 1, 2, 3, 4};
        System.out.println(obj.getLastMoment(n2, left2, right2));

        int n3 = 3;
        int[] left3 = {0};
        int[] right3 = {3};
        System.out.println(obj.getLastMoment(n3, left3, right3));
    }
}
