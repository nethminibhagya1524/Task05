package football;


public class Society implements Comparable<Society> {
  private int position;
  private String  Society;
  private int played;
  private int won;
  private int drawn;
  private int lost;
  private int pointsFor;
  private int pointsAgainst;
  private int pointsDifference;
  private int points;

  public Society(int position, String Society, int played, int won, int drawn,
      int lost, int pointsFor, int pointsAgainst, int pointsDifference, int points)
  {
    this.position = position;
    this.society = society;
    this.played = played;
    this.won = won;
    this.drawn = drawn;
    this.lost = lost;
    this.pointsFor = pointsFor;
    this.pointsAgainst = pointsAgainst;
    this.pointsDifference = pointsDifference;
    this.points = points;
  }

  public String toString() {
    return String.format("%-3d%-20s%10d%10d%10d", position, society, pointsFor,
        pointsAgainst, points);
  }

  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  public String getSociety() {
    return Society;
  }

  public void setSociety(String Society) {
    this.society = society;
  }

  public int getPlayed() {
    return played;
  }

  public void setPlayed(int played) {
    this.played = played;
  }

  public int getWon() {
    return won;
  }

  public void setWon(int won) {
    this.won = won;
  }

  public int getDrawn() {
    return drawn;
  }

  public void setDrawn(int drawn) {
    this.drawn = drawn;
  }

  public int getLost() {
    return lost;
  }

  public void setLost(int lost) {
    this.lost = lost;
  }

  public int getPointsFor() {
    return pointsFor;
  }

  public void setPointsFor(int pointsFor) {
    this.pointsFor = pointsFor;
  }

  public int getPointsAgainst() {
    return pointsAgainst;
  }

  public void setPointsAgainst(int pointsAgainst) {
    this.pointsAgainst = pointsAgainst;
  }

  public int getPointsDifference() {
    return pointsDifference;
  }

  public void setPointsDifference(int pointsDifference) {
    this.pointsDifference = pointsDifference;
  }

    public int getPoints() {
    return points;
  }

  public void setPoints(int points) {
    this.points = points;
  }
  
  public int compareTo(Society c) {
    return ((Integer) pointsFor).compareTo(c.pointsFor);
  }
}
