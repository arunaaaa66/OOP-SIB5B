public class Player {
    String namePlayer = "HORNIE HIPPO 2711";
    int x;
    int y;
    int health = 100;
    int speed = 1;
    int attack = 2;
    int defense = 10;
    boolean firstSkill = true;
    boolean secondSkill = true;
    boolean ultimateSkill = true;

    public void GetInfoPlayer(){
        System.out.println("Informasi Player \nNickname : " + namePlayer + "\nPosisi Player" + "\nX : " + x + "\nY : " + y + " \nHealth : " + health + "\nSpeed : " + speed + "\nAttack : " + attack + "\nDefense : " + defense + "\nSkill Pertama : " + firstSkill + "\nSkill Kedua : " + secondSkill + "\nUltimate Skill : " + ultimateSkill);
    }
    public void moveRight(){
        x = x + speed;
        System.out.println(namePlayer + " bergerak ke kanan\nX : " + x + "\nY : " + y);
    }
    public void moveLeft(){
        x = x - speed;
        System.out.println(namePlayer + " bergerak ke kiri\nX : " + x + "\nY : " + y);
    }
    public void moveUp(){
        y = y + speed;
        System.out.println(namePlayer + " bergerak ke atas\nX : " + x + "\nY : " + y);
    }
    public void moveDown(){
        y = y - speed;      
        System.out.println(namePlayer + " bergerak ke bawah\nX : " + x + "\nY : " + y);
    }
    public int attack(){
        System.out.println("Player mengeluarkan damage : " + attack + " Damage");
        return attack;
    }
    public void getDamage(int health, int defense){
        this.health = this.health - health;
        this.defense = this.defense - defense;
        System.out.println("Player terkena damage : -" + health + " damage & -" + defense + " defense");
        System.out.println("Health player tersisa " + this.health);
        System.out.println("Defense player tersisa " + this.defense);
    }
    public void getPower(){
        attack = attack + 5;
        System.out.println("Player mendapatkan penambahan attack sebanyak : 5");
        System.out.println("Total attack player : " + attack);
    }
    public void dash(int speed){
        this.speed = speed;
        System.out.println("Player melakukan dash");
        System.out.println("Speed player menjadi : "+ this.speed);
    }
    public void isDead(){
        health = 0;
        System.out.println("Player mati");
        System.out.println("Health player : " + health);
    }
    public void isRespawn(){
        health = 100;
        System.out.println("Player hidup kembali");
        System.out.println("Health player : " + health);
    }

    public void firstSkill(boolean useSkill){
        if (useSkill == true) {
            if (firstSkill == true){
                attack = 4;
                System.out.println("Player menggunakan skill pertama dengan attack = " + attack);
            }
        }
        else {
            System.out.println("Skill satu masih Cooldown");
        }
    }
    public void secondSkill(boolean useSkill){
        if (useSkill == true) {
            if (secondSkill == true){
                attack = 7;
                System.out.println("Player menggunakan skill kedua dengan attack = " + attack);
            }
        }
        else {
            System.out.println("Skill kedua masih Cooldown");
        }
    }
    public void ultimateSkill(boolean useSkill){
        if (useSkill == true) {
            if (ultimateSkill == true){
                attack = 10;
                System.out.println("Player menggunakan Ultimate Skill dengan attack = " + attack);
            }
        }
        else {
            System.out.println("Ultimate Skill masih Cooldown");
        }
    }

}