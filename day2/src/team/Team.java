package team;

public class Team {
    String teamName;
    Person[] teamMate;
    String goal;
    
    public Team(String teamName, Person[] teamMate, String goal){
        this.teamName = teamName;
        this.teamMate = teamMate;
        this.goal = goal;
    }

    public void remove(String name){
        for(int i = 0; i<teamMate.length; i++){
            if(teamMate[i].name == name){
                teamMate[i] = null;
            }
        }
    }

    public void addMember(String name, int age){
        Person p = new Person(name, age);
        for(int i = 0; i<teamMate.length; i++){
            if(teamMate[i] == null){
                teamMate[i] = p;
                break;
            }
        }
    }
    
    public void printTeam(){
        int totalAgeSum = 0;
        System.out.println("팀 이름은 "+teamName+" 입니다.");
        System.out.print("팀원의 수는 총 "+teamMate.length+"명이고, 속해있는 사람은 ");
        for(int i = 0; i<teamMate.length; i++){
            if(teamMate[i] == null){
                System.out.print("");
            }
            else if(i == teamMate.length-1){
                System.out.print(teamMate[i].name);
                totalAgeSum+=teamMate[i].age;
            }
            else{
                System.out.print(teamMate[i].name+", ");
                totalAgeSum+=teamMate[i].age;
            }
        }
        System.out.println(" 입니다.");
        System.out.println("팀 평균 연령은 "+(totalAgeSum/teamMate.length)+"살 입니다.");
        System.out.println("팀 목표는 "+goal+" 입니다.");
    }
}
