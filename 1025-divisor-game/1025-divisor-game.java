class Solution {

    Boolean[] dp;

    public boolean divisorGame(int n) {

        dp = new Boolean[n + 1];

        return help(n);
    }

    public boolean help(int n) {

        if (n == 1)
            return false;

        // Already calculated?
        if (dp[n] != null)
            return dp[n];

        for (int i = 1; i < n; i++) {

            if (n % i == 0) {

                if (!help(n - i)) {
                    dp[n] = true;
                    return true;
                }
            }
        }

        dp[n] = false;
        return false;
    }
}