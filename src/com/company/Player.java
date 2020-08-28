package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Player {


    String name;
    public int buildings, animals, seeds;
    private double farmland;
    private int cash;

    public int wheatSeedsPlayer, oatSeedsPlayer, cornSeedsPlayer, potatoSeedsPlayer,appleTreeSeedsPlayer;
    public double MaxHectaresUsed;

    public int maxStorageFoodForAnimals, foodForAnimals;
    private int foodForWeek, foodForYear;

    public int buildingsMaxSize, animalsMaxSize, seedsMaxSize;
    public int noFoodNoAnimal, noFoodNoAnimaltemp;

    int chickenEndSize;
    int dogEndSize;
    int cowEndSize;
    int horseEndSize;
    int rabbitEndSize;

    public List<Integer> smallChickenAnimal = new ArrayList<>();
    public List<Integer> smallDogAnimal = new ArrayList<>();
    public List<Integer> smallCowAnimal = new ArrayList<>();
    public List<Integer> smallHorseAnimal = new ArrayList<>();
    public List<Integer> smallRabbitAnimal = new ArrayList<>();

    public List<Integer> bigChickenAnimal = new ArrayList<>();
    public List<Integer> bigDogAnimal = new ArrayList<>();
    public List<Integer> bigCowAnimal = new ArrayList<>();
    public List<Integer> bigHorseAnimal = new ArrayList<>();
    public List<Integer> bigRabbitAnimal = new ArrayList<>();

    public List<Integer> wheatNeedGrowUp = new ArrayList<>();
    public List<Integer> oatNeedGrowUp = new ArrayList<>();
    public List<Integer> cornNeedGrowUp = new ArrayList<>();
    public List<Integer> potatoNeedGrowUp = new ArrayList<>();
    public List<Integer> appleNeedGrowUp = new ArrayList<>();

    public List<Integer> wheatGrowedUp = new ArrayList<>();
    public List<Integer> oatGrowedUp = new ArrayList<>();
    public List<Integer> cornGrowedUp = new ArrayList<>();
    public List<Integer> potatoGrowedUp = new ArrayList<>();
    public List<Integer> appleGrowedUp = new ArrayList<>();

    public Player(String name) {
        this.name = name; // wprowadzenie imienia gracza

        ThreadLocalRandom random = ThreadLocalRandom.current();

        this.cash = random.nextInt(1000, 5000);
        this.farmland = 0;
        this.animals = 0;
        this.buildings = 0;
        this.seeds = 0;
        this.seedsMaxSize = 0;
        this.buildingsMaxSize = 0;
        this.animalsMaxSize = 0;
        this.MaxHectaresUsed =0;

        this.wheatSeedsPlayer = 0;
        this.oatSeedsPlayer = 0;
        this.cornSeedsPlayer = 0;
        this.potatoSeedsPlayer = 0;
        this.appleTreeSeedsPlayer = 0;

        this.chickenEndSize = 0;
        this.dogEndSize = 0;
        this.cowEndSize = 0;
        this.horseEndSize = 0;
        this.rabbitEndSize = 0;

        this.noFoodNoAnimal = 0;
    }


    public int getCash() {
        return cash;
    }


    static double endFarmlandSize = 20.0;
    static int endAnimalsSize = 5;

    static int endSeedsSize = 5;

    public static void checkEndGame(double FarmlandSize, int fullAnimals, int endFoodForAnimals, int foodForAnimalsNOW) {


        if (FarmlandSize == endFarmlandSize) {
            if (fullAnimals == endAnimalsSize) {
                if (endFoodForAnimals == foodForAnimalsNOW) {
                    System.out.println("     ****************************************");
                    System.out.println("!!!Congratulations you won the game!!!");
                    System.out.println("     ****************************************");
                    System.exit(0);
                }

            }


        }


    }


    public void setFarmland(double farmland) {
        this.farmland = farmland;
    }


    public void setCash(int cash) {
        this.cash = cash;
    }

    public double getFarmland() {
        this.farmland = this.farmland * 100;
        this.farmland = this.farmland / 100;
        return this.farmland;
    }



    // food for animals


    public void setFoodForWeek(int foodsmallChickenAnimal, int foodsmallDogAnimal, int foodsmallCowAnimal, int foodsmallHorseAnimal, int foodsmallRabbitAnimal, int foodbigChickenAnimal, int foodbigDogAnimal, int foodbigCowAnimal, int foodbigHorseAnimal, int foodbigRabbitsAnimal) {
        int finalFoodForWeek = 0;
        int finalFoodForYear = 0;

        int foodForsmallchickens = 5 * foodsmallChickenAnimal;
        int foodForsmalldogs = 5 * foodsmallDogAnimal;
        int foodForsmallcows = 5 * foodsmallCowAnimal;
        int foodForsmallhorses = 5 * foodsmallHorseAnimal;
        int foodForsmallrabbits = 5 * foodsmallRabbitAnimal;
        int foodForbigchickens = 5 * foodbigChickenAnimal;
        int foodForbigdogs = 5 * foodbigDogAnimal;
        int foodForbigcows = 5 * foodbigCowAnimal;
        int foodForbighorses = 5 * foodbigHorseAnimal;
        int foodForbigrabbits = 5 * foodbigRabbitsAnimal;

        finalFoodForWeek = foodForsmallchickens + foodForsmalldogs + foodForsmallcows + foodForsmallhorses + foodForsmallrabbits + foodForbigchickens + foodForbigdogs + foodForbigcows + foodForbighorses + foodForbigrabbits;

        this.foodForWeek = finalFoodForWeek;

        finalFoodForYear = finalFoodForWeek * 52;
        this.foodForYear = finalFoodForYear;


    }

    public int getfoodForWeek() {
        return foodForWeek;
    }


    public int getFoodForYear() {
        return foodForYear;
    }


    public void countAnimals() {
        if (this.chickenEndSize == 0) {
            if (smallChickenAnimal.size() > 0 || bigChickenAnimal.size() > 0) {
                this.chickenEndSize += 1;
            }
        } else if (this.chickenEndSize == 1) {
            if (smallChickenAnimal.size() <= 0 && bigChickenAnimal.size() <= 0) {
                this.chickenEndSize -= 1;
            }
        }

        if (this.dogEndSize == 0) {
            if (smallDogAnimal.size() > 0 || bigDogAnimal.size() > 0) {
                this.dogEndSize += 1;
            }
        } else if (this.dogEndSize == 1) {
            if (smallDogAnimal.size() <= 0 && bigDogAnimal.size() <= 0) {
                this.dogEndSize -= 1;
            }
        }

        if (this.cowEndSize == 0) {
            if (smallCowAnimal.size() > 0 || bigCowAnimal.size() > 0) {
                this.cowEndSize += 1;
            }
        } else if (this.cowEndSize == 1) {
            if (smallCowAnimal.size() <= 0 && bigCowAnimal.size() <= 0) {
                this.cowEndSize -= 1;
            }
        }

        if (this.horseEndSize == 0) {
            if (smallHorseAnimal.size() > 0 || bigHorseAnimal.size() > 0) {
                this.horseEndSize += 1;
            }
        } else if (this.horseEndSize == 1) {
            if (smallHorseAnimal.size() <= 0 && bigHorseAnimal.size() <= 0) {
                this.horseEndSize -= 1;
            }
        }

        if (this.rabbitEndSize == 0) {
            if (smallRabbitAnimal.size() > 0 || bigRabbitAnimal.size() > 0) {
                this.rabbitEndSize += 1;
            }
        } else if (this.horseEndSize == 1) {
            if (smallRabbitAnimal.size() <= 0 && bigRabbitAnimal.size() <= 0) {
                this.rabbitEndSize -= 1;
            }
        }
    }

    public void animalsEatFood(int foodUsage) {



        if (foodUsage <= foodForAnimals) {
            foodForAnimals -= foodUsage;

            if (this.noFoodNoAnimal > 0 ){

                this.noFoodNoAnimal -= 1;

            } else {

                return;
            }
        }

        else {

            this.noFoodNoAnimal+=1;
            int tempsizeofanimals = smallCowAnimal.size() + bigChickenAnimal.size() + smallDogAnimal.size() + bigDogAnimal.size() + smallCowAnimal.size() + bigCowAnimal.size() + smallHorseAnimal.size() + bigHorseAnimal.size() + smallRabbitAnimal.size() + bigRabbitAnimal.size();


            if (this.noFoodNoAnimal <= tempsizeofanimals){

                for ( int j=0; j<this.noFoodNoAnimal; j++){
                    // start


                    if (smallChickenAnimal.size() > 0){

                        smallChickenAnimal.remove(smallChickenAnimal.size() - 1);
                        noFoodNoAnimaltemp -= 1;
                        animals -= 1;
                        animalsMaxSize += 1;


                    } else {


                        if (bigChickenAnimal.size()>0){
                            bigChickenAnimal.remove(bigChickenAnimal.size() - 1);
                            noFoodNoAnimaltemp -= 1;
                            animals -= 1;
                            animalsMaxSize += 1;

                        } else {

                            if (smallDogAnimal.size()>0) {
                                smallDogAnimal.remove(smallDogAnimal.size() - 1);
                                noFoodNoAnimaltemp -= 1;
                                animals -= 1;
                                animalsMaxSize += 1;

                            }else{

                                if (bigDogAnimal.size()>0) {
                                    bigDogAnimal.remove(bigDogAnimal.size() - 1);
                                    noFoodNoAnimaltemp -= 1;
                                    animals -= 1;
                                    animalsMaxSize += 1;

                                } else{

                                    if (smallCowAnimal.size()>0) {
                                        smallCowAnimal.remove(smallCowAnimal.size() - 1);
                                        noFoodNoAnimaltemp -= 1;
                                        animals -= 1;
                                        animalsMaxSize += 1;

                                    } else {

                                        if (bigCowAnimal.size()>0) {
                                            bigCowAnimal.remove(bigCowAnimal.size() - 1);
                                            noFoodNoAnimaltemp -= 1;
                                            animals -= 1;
                                            animalsMaxSize += 1;

                                        } else {

                                            if (smallHorseAnimal.size()>0) {
                                                smallHorseAnimal.remove(smallHorseAnimal.size() - 1);
                                                noFoodNoAnimaltemp -= 1;
                                                animals -= 1;
                                                animalsMaxSize += 1;

                                            } else {

                                                if (bigHorseAnimal.size()>0) {
                                                    bigHorseAnimal.remove(bigHorseAnimal.size() - 1);
                                                    noFoodNoAnimaltemp -= 1;
                                                    animals -= 1;
                                                    animalsMaxSize += 1;

                                                } else {

                                                    if (smallRabbitAnimal.size()>0) {
                                                        smallRabbitAnimal.remove(smallRabbitAnimal.size() - 1);
                                                        noFoodNoAnimaltemp -= 1;
                                                        animals -= 1;
                                                        animalsMaxSize += 1;

                                                    } else {
                                                        if (bigRabbitAnimal.size()>0) {
                                                            bigRabbitAnimal.remove(bigRabbitAnimal.size() - 1);
                                                            noFoodNoAnimaltemp -= 1;
                                                            animals -= 1;
                                                            animalsMaxSize += 1;

                                                        } else{

                                                            return;
                                                        }
                                                    }
                                                }
                                            }

                                        }

                                    }
                                }

                            }

                        }



                    }


                    // stop


                }


            }




            else {



                noFoodNoAnimaltemp=tempsizeofanimals;
                for ( int j=0; j<noFoodNoAnimaltemp; j++){


                    // wklej to co u gory

                    // start

                    if (smallChickenAnimal.size() > 0){

                        smallChickenAnimal.remove(smallChickenAnimal.size() - 1);
                        noFoodNoAnimaltemp -= 1;
                        animals -= 1;
                        animalsMaxSize += 1;

                    } else {


                        if (bigChickenAnimal.size()>0){
                            bigChickenAnimal.remove(bigChickenAnimal.size() - 1);
                            noFoodNoAnimaltemp -= 1;
                            animals -= 1;
                            animalsMaxSize += 1;

                        } else {

                            if (smallDogAnimal.size()>0) {
                                smallDogAnimal.remove(smallDogAnimal.size() - 1);
                                noFoodNoAnimaltemp -= 1;
                                animals -= 1;
                                animalsMaxSize += 1;

                            }else{

                                if (bigDogAnimal.size()>0) {
                                    bigDogAnimal.remove(bigDogAnimal.size() - 1);
                                    noFoodNoAnimaltemp -= 1;
                                    animals -= 1;
                                    animalsMaxSize += 1;

                                } else{

                                    if (smallCowAnimal.size()>0) {
                                        smallCowAnimal.remove(smallCowAnimal.size() - 1);
                                        noFoodNoAnimaltemp -= 1;
                                        animals -= 1;
                                        animalsMaxSize += 1;

                                    } else {

                                        if (bigCowAnimal.size()>0) {
                                            bigCowAnimal.remove(bigCowAnimal.size() - 1);
                                            noFoodNoAnimaltemp -= 1;
                                            animals -= 1;
                                            animalsMaxSize += 1;

                                        } else {

                                            if (smallHorseAnimal.size()>0) {
                                                smallHorseAnimal.remove(smallHorseAnimal.size() - 1);
                                                noFoodNoAnimaltemp -= 1;
                                                animals -= 1;
                                                animalsMaxSize += 1;

                                            } else {

                                                if (bigHorseAnimal.size()>0) {
                                                    bigHorseAnimal.remove(bigHorseAnimal.size() - 1);
                                                    noFoodNoAnimaltemp -= 1;
                                                    animals -= 1;
                                                    animalsMaxSize += 1;

                                                } else {

                                                    if (smallRabbitAnimal.size()>0) {
                                                        smallRabbitAnimal.remove(smallRabbitAnimal.size() - 1);
                                                        noFoodNoAnimaltemp -= 1;
                                                        animals -= 1;
                                                        animalsMaxSize += 1;

                                                    } else {
                                                        if (bigRabbitAnimal.size()>0) {
                                                            bigRabbitAnimal.remove(bigRabbitAnimal.size() - 1);
                                                            noFoodNoAnimaltemp -= 1;
                                                            animals -= 1;
                                                            animalsMaxSize += 1;

                                                        } else{

                                                            return;
                                                        }
                                                    }
                                                }
                                            }

                                        }

                                    }
                                }

                            }

                        }



                    }


                    // stop

                }

            }



































        }




    }
}


