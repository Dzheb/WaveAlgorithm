class MapGenerator {
  int[][] map;

  public MapGenerator() {
      int[][] map = {
              { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
              { -1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1 },
              { -1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1 },
              { -1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1 },
              { -1, 0, 0, 0, -1, 0, -1, -1, -1, -1, 0, 0, 0, 0, -1 },
              { -1, 0, 0, 0, -1, 0, -1, 0, 0, -1, 0, 0, 0, 0, -1 },
              { -1, -1, -1, 0, -1, 0, -1, 0, 0, -1, 0, 0, 0, 0, -1 },
              { -1, 0, 0, 0, -1, 0, -1, 0, 0, -1, -1, -1, 0, 0, -1 },
              { -1, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1 },
              { -1, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1 },
              { -1, 0, 0, 0, -1, -1, -1, -1, -1, -1, 0, 0, 0, 0, -1 },
              { -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1 },
              { -1, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, 0, 0, 0, -1 },
              { -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1 },
              { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
      };

      this.map = map;
  }

  public int[][] getMap() {
      return map;
  }

  // Установка точки начала по координатам x, y равной 1
  public void setStart(Point2D pos) {
      map[pos.x][pos.y] = 1;
  }
  // Установка точки выхода
  public Point2D setExit(int ep) {
      Point2D pexit = new Point2D(0, 0);
      boolean found = false;
      for (int i = 0; i < map.length; i++) {
          for (int j = 0; j < map[i].length; j++) {
          if (map[i][j] == ep) {
              pexit = new Point2D(i, j);
              found = true;
              break;
              }
          }
          if (found) break;
      }
      return pexit;
  }
}
