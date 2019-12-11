package chapter4;

public class Game {
   private String TeamOne;
   private String Sport;

   private String TeamTwo;
   private String Time;
   private Team Team;
   public Game() {
	      TeamOne = "Carolina Forest";
	      Sport = "Football";
	      TeamTwo = "Socaste";
	      Time = "7 PM";
	      Team = new Team();
	   }
	   public Game(String TeamOne, String TeamTwo, String Sport, String Time) {
	      this.TeamOne = TeamOne;
	      this.TeamTwo = TeamTwo;
	      this.Sport = Sport;
	      this.Time = Time;
	      Team = new Team(TeamOne, TeamTwo, Sport, Time);
	   }
   public String getTeamOne(){return TeamOne;}
   public void setTeamOne(String TeamOne){this.TeamOne = TeamOne;}
   public String getTeamTwo(){return TeamTwo;}
   public void setTeamTwo(String TeamTwo){this.TeamTwo = TeamTwo;}
   public String getTime() {return Time;}
   public void setTime(String Time) {this.Time = Time;}
   public String getSport() {return Sport;}
   public void setSport(String Sport) {this.Sport = Sport;}

   
   public Team getTeam(){return Team;}
   public void setTeam(Team b){Team = b;}
}
