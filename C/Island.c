#include <stdio.h>

#define MAX 100

int n, m;
int grid[MAX][MAX];
int visited[MAX][MAX];

// Directions: 8 neighbors (horizontal, vertical, diagonal)
int dx[] = {-1, -1, -1, 0, 0, 1, 1, 1};
int dy[] = {-1, 0, 1, -1, 1, -1, 0, 1};

// DFS to mark all connected land
void dfs(int x, int y) {
    visited[x][y] = 1;

    for (int dir = 0; dir < 8; dir++) {
        int nx = x + dx[dir];
        int ny = y + dy[dir];

        if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
            if (grid[nx][ny] == 1 && !visited[nx][ny]) {
                dfs(nx, ny);
            }
        }
    }
}

int main() {
    printf("Enter number of rows and columns: ");
    scanf("%d %d", &n, &m);

    printf("Enter the grid (0 for water, 1 for land) row by row:\n");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            scanf("%d", &grid[i][j]);
            visited[i][j] = 0;
        }
    }

    // Optional: Print grid to verify input
    printf("Your grid:\n");
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            printf("%d ", grid[i][j]);
        }
        printf("\n");
    }

    int count = 0;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (grid[i][j] == 1 && !visited[i][j]) {
                dfs(i, j);
                count++;
            }
        }
    }

    printf("Number of islands: %d\n", count);

    return 0;
}
