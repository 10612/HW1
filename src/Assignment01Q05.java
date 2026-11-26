public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i == j) {
            return 0;
        }

        boolean[] visitedVertices = new boolean[m.length], nextVertices = new boolean[m.length];
        visitedVertices[i] = true;
        nextVertices[i] = true;
        int depth = 0;
        do {
            nextVertices = composeDestinations(m, nextVertices);
            depth++;
            if (nextVertices[j]) {
                return depth;
            }
            compareToVisited(visitedVertices, nextVertices);
        } while (!hasFinished(nextVertices));
        
        return -1;
    }

    public static boolean[] composeDestinations(int[][] graph, boolean[] currentVertices) {
        boolean[] nextVertices = new boolean[graph.length];

        for (int i = 0; i < currentVertices.length; i++) {
            if (currentVertices[i]) {
                for (int j = 0; j < graph.length; j++) {
                    if (graph[i][j] == 1) {
                        graph[i][j] = 0;
                        nextVertices[j] = true;
                    }
                }
            }
        }

        return nextVertices;
    }

    public static void compareToVisited(boolean[] visitedVertices, boolean[] nextVertices) {
        for (int i = 0; i < visitedVertices.length; i++) {
            if (nextVertices[i]) {
                if (visitedVertices[i]) {
                    nextVertices[i] = false;
                }

                visitedVertices[i] = true;
            }
        }
    }

    public static boolean hasFinished(boolean[] nextVertices) {
        for (boolean vertex : nextVertices) {
            if (vertex) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}