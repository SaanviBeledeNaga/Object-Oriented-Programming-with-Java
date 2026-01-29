import java.util.*;
public class CheapestFlight 
{
    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) 
	{
        int INF = 100000000;
        int[] cost = new int[n];
        int[] newCost = new int[n];
        Arrays.fill(cost, INF);
        cost[src] = 0;
        for (int i = 0; i <= K; i++) 
		{
            for (int c = 0; c < n; c++) newCost[c] = cost[c];
            for (int[] f : flights) 
			{
                int u = f[0], v = f[1], w = f[2];
                if (cost[u] + w < newCost[v])
				{
                    newCost[v] = cost[u] + w;
                }
            }
            for (int c = 0; c < n; c++) cost[c] = newCost[c];
        }
        return cost[dst] >= INF ? -1 : cost[dst];
    }
    public static void main(String[] args) {
        int[][] flights = {
            {0, 1, 100},
            {1, 2, 100},
            {0, 2, 500}
        };
        System.out.println(findCheapestPrice(3, flights, 0, 2, 1)); 
    }
}
