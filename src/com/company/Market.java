package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Market {

    private static boolean alreadyOpenShop = false;

    static int smallCowBUY = 0;
    static int smallHorseBUY = 0;
    static int smallRabbitBUY = 0;
    static int smallChickenBUY = 0;
    static int smallDogBUY = 0;

    static int smallCowSELL = 0;
    static int smallHorseSELL = 0;
    static int smallRabbitSELL = 0;
    static int smallChickenSELL = 0;
    static int smallDogSELL = 0;

    static int bigCowBUY = 0;
    static int bigHorseBUY = 0;
    static int bigRabbitBUY = 0;
    static int bigChickenBUY = 0;
    static int bigDogBUY = 0;

    static int bigCowSELL = 0;
    static int bigHorseSELL = 0;
    static int bigRabbitSELL = 0;
    static int bigChickenSELL = 0;
    static int bigDogSELL = 0;

    static int WheatSeedsBUY = 0;
    static int OatSeedsBUY = 0;
    static int CornSeedsBUY = 0;
    static int PotatoSeedsBUY = 0;
    static int AppleTreeSeedsBUY = 0;

    static int WheatSeedsSELL = 0;
    static int OatSeedsSELL = 0;
    static int CornSeedsSELL = 0;
    static int PotatoSeedsSELL = 0;
    static int AppleTreeSeedsSELL = 0;

    static int milkSELL = 0;
    static int foodForAnimalBUY = 0;
    static int foodForAnimalSELL = 0;
    static int eggSELL = 0;

    static int priceTempBuy = 0;
    static int priceTempSell = 0;
    static int animalTempNumber = 0;
    static int seedsTempNumber = 0;

    static int potatoBUY = 0;
    static int potatoSELL  = 0;
    static int appleBUY  = 0;
    static int appleSELL  = 0;

    //
    static int tempsmallChickenAnimal = 0;
    static int tempsmallDogAnimal = 0;
    static int tempsmallCowAnimal = 0;
    static int tempsmallHorseAnimal = 0;
    static int tempsmallRabbitAnimal = 0;

    static int tempbigChickenAnimal = 0;
    static int tempbigDogAnimal = 0;
    static int tempbigCowAnimal = 0;
    static int tempbigHorseAnimal = 0;
    static int tempbigRabbitAnimal = 0;

    static int tempWheatSeed= 0;
    static int tempOatSeed= 0;
    static int tempCornSeed= 0;
    static int tempPotatoSeed= 0;
    static int tempAppleTreeSeed= 0;

    static int tempFoodForAnimal=0;

    static int tempPotato;
    static int tempApple;


//

    public static int Marketplace(int cash, int maxAnimalsThatCanBuy,int sizesmallChickenAnimal,int sizesmallDogAnimal,int sizesmallCowAnimal,int sizesmallHorseAnimal,int sizebigChickenAnimal,int sizebigDogAnimal,int sizebigCowAnimal,int sizebigHorseAnimal,int sizeWheatSeed,int sizeOatSeed,int sizeCornSeed,int sizePotatoSeed,int sizeAppleTreeSeed,int sizesmallRabbitAnimal,int sizebigRabbitsAnimal, int sizestorage, int actualfood, int actualPotato, int actualApple) {




        if (getAlreadyOpenShop() == true) {
            priceTempBuy = 0;
            animalTempNumber = 0;
            seedsTempNumber = 0;
            priceTempSell =0;
            //
            tempsmallChickenAnimal = 0;
            tempsmallDogAnimal = 0;
            tempsmallCowAnimal = 0;
            tempsmallHorseAnimal = 0;
            tempsmallRabbitAnimal = 0;

            tempbigChickenAnimal = 0;
            tempbigDogAnimal = 0;
            tempbigCowAnimal = 0;
            tempbigHorseAnimal = 0;
            tempbigRabbitAnimal = 0;

            tempWheatSeed= 0;
            tempOatSeed= 0;
            tempCornSeed= 0;
            tempPotatoSeed= 0;
            tempFoodForAnimal=0;

            tempPotato =0;
            tempApple =0;

//



            //
            System.out.println("You saw these prices: ");

            System.out.println("    BUY:  ****************************************        SELL:        ****************************************      INFO:");
            // sell and buy #1
            System.out.print("1. Small Cow: " + smallCowBUY);
            System.out.print("                                     ");
            System.out.print("2. Small Cow: " + smallCowSELL);
            System.out.print("                                      ");
            System.out.print("Time to grow up: 25 weeks");
            // sell and buy #2
            System.out.println("");
            System.out.print("3. Small Horse: " + smallHorseBUY);
            System.out.print("                                   ");
            System.out.print("4. Small Horse: " + smallHorseSELL);
            System.out.print("                                    ");
            System.out.print("Time to grow up: 15 weeks");
            // sell and buy #3
            System.out.println("");
            System.out.print("5. Small Rabbit: " + smallRabbitBUY);
            System.out.print("                                  ");
            System.out.print("6. Small Rabbit: " + smallRabbitSELL);
            System.out.print("                                   ");
            System.out.print("Time to grow up: 13 weeks");
            // sell and buy #4
            System.out.println("");
            System.out.print("7. Small Chicken: " + smallChickenBUY);
            System.out.print("                                 ");
            System.out.print("8. Small Chicken: " + smallChickenSELL);
            System.out.print("                                  ");
            System.out.print("Time to grow up: 20 weeks");
            // sell and buy #5
            System.out.println("");
            System.out.print("9. Small Dog: " + smallDogBUY);
            System.out.print("                                     ");
            System.out.print("10. Small Dog: " + smallDogSELL);
            System.out.print("                                     ");
            System.out.print("Time to grow up: 10 weeks");
            System.out.println("");
            System.out.println("    ------------------------------------------------------------------------------------------------------------   ");


            // sell and buy #6

            System.out.print("11. Wheat Seed: " + WheatSeedsBUY);
            System.out.print("                                   ");
            System.out.print("12. Wheat Seed: " + WheatSeedsSELL);
            System.out.print("                                      ");
            System.out.print("One seed needs - 0.18 hectares to plant it / Time growing up - 40 weeks / it gives you 8 animal food");

            // sell and buy #7
            System.out.println("");
            System.out.print("13. Oat Seed: " + OatSeedsBUY);
            System.out.print("                                    ");
            System.out.print("14. Oat Seed: " + OatSeedsSELL);
            System.out.print("                                      ");
            System.out.print("One seed needs - 0.25 hectares to plant it / Time growing up - 25 weeks / it gives you 15 animal food");

            // sell and buy #8
            System.out.println("");
            System.out.print("15. Corn Seed: " + CornSeedsBUY);
            System.out.print("                                   ");
            System.out.print("16. Corn Seed: " + CornSeedsSELL);
            System.out.print("                                    ");
            System.out.print("One seed needs - 0.39 hectares to plant it / Time growing up - 60 weeks / it gives you 6 animal food");

            // sell and buy #9
            System.out.println("");
            System.out.print("17. Potato Seed: " + PotatoSeedsBUY);
            System.out.print("                                 ");
            System.out.print("18. Potato Seed: " + PotatoSeedsSELL);
            System.out.print("                                 ");
            System.out.print("One seed needs - 0.15 hectares to plant it / Time growing up - 80 weeks / it gives you 4 potatoes");

            // sell and buy #10
            System.out.println("");
            System.out.print("19. Apple Tree Seed: " + AppleTreeSeedsBUY);
            System.out.print("                                ");
            System.out.print("20. Apple Tree Seed: " + AppleTreeSeedsSELL);
            System.out.print("                                ");
            System.out.print("One seed needs - 0.54 hectares to plant it / Time growing up - 120 weeks / it gives you 15 apples");

            System.out.println("");


            System.out.println("    ------------------------------------------------------------------------------------------------------------   ");


            // sell and buy #10

            System.out.print("21. Big Cow: " + bigCowBUY);
            System.out.print("                                     ");
            System.out.print("22. Big Cow: " + bigCowSELL);
            System.out.print("                                     ");
            System.out.print("Chance to reproduce 30%");
            // sell and buy #11
            System.out.println("");
            System.out.print("23. Big Horse: " + bigHorseBUY);
            System.out.print("                                   ");
            System.out.print("24. Big Horse: " + bigHorseSELL);
            System.out.print("                                    ");
            System.out.print("Chance to reproduce 20%");
            // sell and buy #12
            System.out.println("");
            System.out.print("25. Big Rabbit: " + bigRabbitBUY);
            System.out.print("                                  ");
            System.out.print("26. Big Rabbit: " + bigRabbitSELL);
            System.out.print("                                   ");
            System.out.print("Chance to reproduce 60%");
            // sell and buy #13
            System.out.println("");
            System.out.print("27. Big Chicken: " + bigChickenBUY);
            System.out.print("                                 ");
            System.out.print("28. Big Chicken: " + bigChickenSELL);
            System.out.print("                                  ");
            System.out.print("Chance to reproduce 40%");
            // sell and buy #14
            System.out.println("");
            System.out.print("29. Big Dog: " + bigDogBUY);
            System.out.print("                                      ");
            System.out.print("30. Big Dog: " + bigDogSELL);
            System.out.print("                                      ");
            System.out.print("Chance to reproduce 40%");
            System.out.println("");
            System.out.println("    ------------------------------------------------------------------------------------------------------------   ");



            // sell and buy #16
            System.out.println("");
            System.out.print("31. Food For Animal: " + foodForAnimalBUY);
            System.out.print("                              ");
            System.out.print("32. Food For Animal: " + foodForAnimalSELL);

            System.out.println("");
            System.out.println("    ------------------------------------------------------------------------------------------------------------   ");

            // sell and buy #17
            System.out.println("");
            System.out.print("33. Potato: " + potatoBUY );
            System.out.print("                              ");
            System.out.print("34. Potato: " + potatoSELL );

            // sell and buy #18
            System.out.println("");
            System.out.print("35. Apple: " + appleBUY );
            System.out.print("                              ");
            System.out.print("36. Apple: " + appleSELL );




            System.out.println("");
            System.out.println("**************************************************************************************************************************");
            System.out.println("0. Exit Marketplace");
            alreadyOpenShop = true;


            System.out.println("I chose number: ");
            Scanner in = new Scanner(System.in);
            int choose = in.nextInt();

            // buy
            if (choose == 1) {
                if (maxAnimalsThatCanBuy > 0){
                    if (cash > smallCowBUY) {
                        System.out.println("Congratulations you bought it!");
                        priceTempBuy = priceTempBuy + smallCowBUY;
                        animalTempNumber = animalTempNumber +1;
                        tempsmallCowAnimal = 1;
                    } else {
                        System.out.println("Check your balance.");
                        return choose;
                    }
                } else {
                    System.out.println("You cant buy you dont have enough place for animals.");
                    return choose;
                }

            }
            else if (choose == 3){
                if (maxAnimalsThatCanBuy > 0){
                    if (cash > smallHorseBUY) {
                        System.out.println("Congratulations you bought it!");
                        priceTempBuy = priceTempBuy + smallHorseBUY;
                        animalTempNumber = animalTempNumber +1;
                        tempsmallHorseAnimal = 1;
                    } else {
                        System.out.println("Check your balance.");
                        return choose;
                    }
                }else {
                    System.out.println("You cant buy you dont have enough place for animals.");
                    return choose;
                }

            }
            else if (choose == 5){
                if (maxAnimalsThatCanBuy > 0){
                    if (cash > smallRabbitBUY) {
                        System.out.println("Congratulations you bought it!");
                        priceTempBuy = priceTempBuy + smallRabbitBUY;
                        animalTempNumber = animalTempNumber +1;
                        tempsmallRabbitAnimal = 1;
                    } else {
                        System.out.println("Check your balance.");
                        return choose;
                    }
                } else {
                    System.out.println("You cant buy you dont have enough place for animals.");
                    return choose;
                }

            }
            else if (choose == 7){
                if (maxAnimalsThatCanBuy > 0){
                    if (cash > smallChickenBUY) {

                        System.out.println("Congratulations you bought it!");
                        priceTempBuy = priceTempBuy + smallChickenBUY;
                        animalTempNumber = animalTempNumber +1;
                        tempsmallChickenAnimal = 1;
                    } else {
                        System.out.println("Check your balance.");
                        return choose;
                    }
                }else {
                    System.out.println("You cant buy you dont have enough place for animals.");
                    return choose;
                }

            }
            else if (choose == 9){
                if (maxAnimalsThatCanBuy > 0){
                    if (cash > smallDogBUY) {
                        System.out.println("Congratulations you bought it!");
                        priceTempBuy = priceTempBuy + smallDogBUY;
                        animalTempNumber = animalTempNumber +1;
                        tempsmallDogAnimal = 1;
                    } else {
                        System.out.println("Check your balance.");
                        return choose;



                    }
                }else {
                    System.out.println("You cant buy you dont have enough place for animals.");
                    return choose;
                }
            }


            else if (choose == 11){

                if (cash > WheatSeedsBUY) {

                    System.out.println("Congratulations you bought it!");
                    priceTempBuy = priceTempBuy + WheatSeedsBUY;
                    seedsTempNumber = seedsTempNumber+1;
                    tempWheatSeed = 1;



                } else {
                    System.out.println("Check your balance.");
                    return choose;

                }}
            else if (choose == 13){

                if (cash > OatSeedsBUY) {


                    System.out.println("Coongratulations you bought it!");
                    priceTempBuy = priceTempBuy + OatSeedsBUY;
                    seedsTempNumber = seedsTempNumber+1;
                    tempOatSeed = 1;



                } else {
                    System.out.println("Check your balance.");
                    return choose;

                }}
            else if (choose == 15){

                if (cash > CornSeedsBUY) {

                    System.out.println("Congratulations you bought it!");
                    priceTempBuy = priceTempBuy + CornSeedsBUY;
                    seedsTempNumber = seedsTempNumber+1;
                    tempCornSeed = 1;



                } else {
                    System.out.println("Check your balance.");
                    return choose;

                }}
            else if (choose == 17){

                if (cash > PotatoSeedsBUY) {

                    System.out.println("Congratulations you bought it!");
                    priceTempBuy = priceTempBuy + PotatoSeedsBUY;
                    seedsTempNumber = seedsTempNumber+1;
                    tempPotatoSeed = 1;




                } else {
                    System.out.println("Check your balance.");
                    return choose;

                }}
            else if (choose == 19){

                if (cash > AppleTreeSeedsBUY) {

                    System.out.println("Congratulations you bought it!");
                    priceTempBuy = priceTempBuy + AppleTreeSeedsBUY;
                    seedsTempNumber = seedsTempNumber+1;
                    tempAppleTreeSeed = 1;




                } else {
                    System.out.println("Check your balance.");
                    return choose;

                }}

            else if (choose == 21){
                if (maxAnimalsThatCanBuy > 0){
                    if (cash > bigCowBUY) {
                        System.out.println("Congratulations you bought it!");
                        priceTempBuy = priceTempBuy + bigCowBUY;
                        animalTempNumber = animalTempNumber +1;
                        tempbigCowAnimal = 1;
                    } else {
                        System.out.println("Check your balance.");
                        return choose;

                    }
                }else {
                    System.out.println("You cant buy you dont have enough place for animals.");
                    return choose;
                }
            }
            else if (choose == 23){
                if (maxAnimalsThatCanBuy > 0){
                    if (cash > bigHorseBUY) {

                        System.out.println("Congratulations you bought it!");
                        priceTempBuy = priceTempBuy + bigHorseBUY;
                        animalTempNumber = animalTempNumber +1;
                        tempbigHorseAnimal = 1;
                    } else {
                        System.out.println("Check your balance.");
                        return choose;

                    }
                }else {
                    System.out.println("You cant buy you dont have enough place for animals.");
                    return choose;
                }
            }
            else if (choose == 25){
                if (maxAnimalsThatCanBuy > 0){
                    if (cash > bigRabbitBUY) {

                        System.out.println("Congratulations you bought it!");
                        priceTempBuy = priceTempBuy + bigRabbitBUY;
                        animalTempNumber = animalTempNumber +1;
                        tempbigRabbitAnimal = 1;
                    } else {
                        System.out.println("Check your balance.");
                        return choose;

                    }
                }else {
                    System.out.println("You cant buy you dont have enough place for animals.");
                    return choose;
                }
            }
            else if (choose == 27){
                if (maxAnimalsThatCanBuy > 0){
                    if (cash > bigChickenBUY) {

                        System.out.println("Congratulations you bought it!");
                        priceTempBuy = priceTempBuy + bigChickenBUY;
                        animalTempNumber = animalTempNumber +1;
                        tempbigChickenAnimal = 1;
                    } else {
                        System.out.println("Check your balance.");
                        return choose;

                    }
                }else {
                    System.out.println("You cant buy you dont have enough place for animals.");
                    return choose;
                }
            }
            else if (choose == 29){
                if (maxAnimalsThatCanBuy > 0){
                    if (cash > bigDogBUY) {

                        System.out.println("Congratulations you bought it!");
                        priceTempBuy = priceTempBuy + bigDogBUY;
                        animalTempNumber = animalTempNumber +1;
                        tempbigDogAnimal = 1;
                    } else {
                        System.out.println("Check your balance.");
                        return choose;

                    }
                }else {
                    System.out.println("You cant buy you dont have enough place for animals.");
                    return choose;
                }
            }

            else if (choose == 31) {
                if (sizestorage>0){
                    if (cash > foodForAnimalBUY) {
                        System.out.println("Congratulations you bought it!");
                        priceTempBuy = priceTempBuy + foodForAnimalBUY;
                        tempFoodForAnimal = 1;

                    } else {
                        System.out.println("Check your balance.");
                        return choose;

                    }
                }else {
                    System.out.println("You dont have enough space for food.");
                }
            }

            //

            else if (choose == 33) {

                if (cash > appleBUY ) {
                    System.out.println("Congratulations you bought it!");
                    priceTempBuy = priceTempBuy + potatoBUY  ;
                    tempPotato = 1;

                } else {
                    System.out.println("Check your balance.");

                    return choose;

                }
            }

            else if (choose == 35) {

                if (cash > appleBUY ) {
                    System.out.println("Congratulations you bought it!");
                    priceTempBuy = priceTempBuy + appleBUY ;
                    tempApple = 1;

                } else {
                    System.out.println("Check your balance.");
                    return choose;

                }

            }

            // sell

            else if (choose == 2){
                if (sizesmallCowAnimal>0){
                    tempsmallCowAnimal = -1;
                    priceTempSell = priceTempSell + smallCowSELL;
                    System.out.println("Congratulation you sell small cow for: " + priceTempSell);
                } else {
                    System.out.println("You dont have small cow");
                }
            }
            else if (choose == 4){
                if (sizesmallHorseAnimal>0){
                    tempsmallHorseAnimal = -1;
                    priceTempSell = priceTempSell + smallHorseSELL;
                    System.out.println("Congratulation you sell small horse for: " + priceTempSell);
                } else {
                    System.out.println("You dont have small horse");
                }
            }
            else if (choose == 8){
                if (sizesmallChickenAnimal>0){
                    tempsmallChickenAnimal = -1;
                    priceTempSell = priceTempSell + smallChickenSELL;
                    System.out.println("Congratulation you sell small chicken for: " + priceTempSell);
                } else {
                    System.out.println("You dont have small chicken");
                }
            }
            else if (choose == 10){
                if (sizesmallDogAnimal>0){
                    tempsmallDogAnimal = -1;
                    priceTempSell = priceTempSell + smallDogSELL;
                    System.out.println("Congratulation you sell small dog for: " + priceTempSell);

                } else {
                    System.out.println("You dont have small dog");
                }
            }
            else if (choose == 6){
                if (sizesmallRabbitAnimal>0){
                    tempsmallRabbitAnimal = -1;
                    priceTempSell = priceTempSell + smallRabbitSELL;
                    System.out.println("Congratulation you sell small rabbit for: " + priceTempSell);
                } else {
                    System.out.println("You dont have small rabbit");
                }
            }


            else if (choose == 12){
                if (sizeWheatSeed>0){
                    tempWheatSeed = -1;
                    priceTempSell = priceTempSell + WheatSeedsSELL;
                    System.out.println("Congratulation you sell wheat seed for: " + priceTempSell);
                } else {
                    System.out.println("You dont have wheat seed");
                }
            }
            else if (choose == 14){
                if (sizeOatSeed>0){
                    tempOatSeed = -1;
                    priceTempSell = priceTempSell + OatSeedsSELL;
                    System.out.println("Congratulation you sell oat seed for: " + priceTempSell);

                } else {
                    System.out.println("You dont have oat seed");
                }
            }
            else if (choose == 16){
                if (sizeCornSeed>0){
                    tempCornSeed = -1;
                    priceTempSell = priceTempSell + CornSeedsSELL;
                    System.out.println("Congratulation you sell corn seed for: " + priceTempSell);

                } else {
                    System.out.println("You dont have corn seed");
                }
            }
            else if (choose == 18){
                if (sizePotatoSeed>0){
                    tempPotatoSeed = -1;
                    priceTempSell = priceTempSell + PotatoSeedsSELL;
                    System.out.println("Congratulation you sell potato seed for: " + priceTempSell);

                } else {
                    System.out.println("You dont have Potato seed");
                }
            }
            else if (choose == 20){
                if (sizeAppleTreeSeed>0){
                    tempAppleTreeSeed = -1;
                    priceTempSell = priceTempSell + AppleTreeSeedsSELL;
                    System.out.println("Congratulation you sell potato seed for: " + priceTempSell);

                } else {
                    System.out.println("You dont have Apple Tree seeds");
                }
            }

            else if (choose == 22){
                if (sizebigCowAnimal>0){
                    tempbigCowAnimal = -1;
                    priceTempSell = priceTempSell + bigCowSELL;
                    System.out.println("Congratulation you sell big cow for: " + priceTempSell);

                } else {
                    System.out.println("You dont have big cow.");
                }
            }
            else if (choose == 24){
                if (sizebigHorseAnimal>0){
                    tempbigHorseAnimal = -1;
                    priceTempSell = priceTempSell + bigHorseSELL;
                    System.out.println("Congratulation you sell big horse for: " + priceTempSell);

                } else {
                    System.out.println("You dont have big horse");
                }
            }
            else if (choose == 26){
                if (sizebigRabbitsAnimal>0){
                    tempbigRabbitAnimal = -1;
                    priceTempSell = priceTempSell + bigRabbitSELL;
                    System.out.println("Congratulation you sell big rabbit for: " + priceTempSell);
                } else {
                    System.out.println("You dont have big Rabbit");
                }
            }
            else if (choose == 28){
                if (sizebigChickenAnimal>0){
                    tempbigChickenAnimal = -1;
                    priceTempSell = priceTempSell + bigChickenSELL;
                    System.out.println("Congratulation you sell big chicken for: " + priceTempSell);

                } else {
                    System.out.println("You dont have big chicken");
                }
            }
            else if (choose == 30){
                if (sizebigDogAnimal>0){
                    tempbigDogAnimal = -1;
                    priceTempSell = priceTempSell + bigDogSELL;
                    System.out.println("Congratulation you sell big dog for: " + priceTempSell);

                } else {
                    System.out.println("You dont have big dog");
                }
            }

            else if (choose == 32){
                if (actualfood>0){
                    tempFoodForAnimal = -1;
                    priceTempSell = priceTempSell + foodForAnimalSELL;
                    System.out.println("Congratulation you sell food for: " + priceTempSell);
                } else {
                    System.out.println("You dont have food for sell");
                }
            }

            //

            else if (choose == 34){
                if (actualPotato>0){
                    tempPotato = -1;
                    priceTempSell = priceTempSell + potatoSELL ;
                    System.out.println("Congratulation you sell potato for: " + priceTempSell);
                } else {
                    System.out.println("You dont have food for sell");
                }
            }



            else if (choose == 36){
                if (actualApple>0){
                    tempApple = -1;
                    priceTempSell = priceTempSell + appleSELL ;
                    System.out.println("Congratulation you sell apple for: " + priceTempSell);
                } else {
                    System.out.println("You dont have food for sell");
                }
            }


            else if (choose == 0){

                return choose;
            }
            else {
                System.out.println("Please dont brake the game.");
            }










        } else if (getAlreadyOpenShop() == false) {
            priceTempBuy = 0;
            priceTempSell =0;
            animalTempNumber = 0;
            seedsTempNumber = 0;

            //
            tempsmallChickenAnimal = 0;
            tempsmallDogAnimal = 0;
            tempsmallCowAnimal = 0;
            tempsmallHorseAnimal = 0;
            tempsmallRabbitAnimal=0;

            tempbigChickenAnimal = 0;
            tempbigDogAnimal = 0;
            tempbigCowAnimal = 0;
            tempbigHorseAnimal = 0;
            tempbigRabbitAnimal =0;

            tempWheatSeed= 0;
            tempOatSeed= 0;
            tempCornSeed= 0;
            tempPotatoSeed= 0;
            tempFoodForAnimal=0;
//
            System.out.println("Look there are new prices: ");


            ThreadLocalRandom random = ThreadLocalRandom.current();
            smallCowBUY = random.nextInt(40, 60);
            smallHorseBUY = random.nextInt(20, 35);
            smallRabbitBUY = random.nextInt(10, 20);
            smallChickenBUY = random.nextInt(20, 35);
            smallDogBUY = random.nextInt(10, 20);

            smallCowSELL = random.nextInt(4, 6);
            smallHorseSELL = random.nextInt(2, 3);
            smallRabbitSELL = random.nextInt(1, 2);
            smallChickenSELL = random.nextInt(2, 3);
            smallDogSELL = random.nextInt(1, 2);

            bigCowBUY = random.nextInt(170, 180);
            bigHorseBUY = random.nextInt(120, 130);
            bigRabbitBUY = random.nextInt(120, 130);
            bigChickenBUY = random.nextInt(100, 110);
            bigDogBUY = random.nextInt(60, 70);

            bigCowSELL = random.nextInt(120, 160);
            bigHorseSELL = random.nextInt(90, 110);
            bigRabbitSELL = random.nextInt(90, 110);
            bigChickenSELL = random.nextInt(70, 90);
            bigDogSELL = random.nextInt(40, 50);


            WheatSeedsBUY = random.nextInt(10, 20);
            OatSeedsBUY = random.nextInt(15, 25);
            CornSeedsBUY = random.nextInt(20, 30);
            PotatoSeedsBUY = random.nextInt(35, 45);
            AppleTreeSeedsBUY = random.nextInt(100, 300);

            WheatSeedsSELL = random.nextInt(2, 4);
            OatSeedsSELL = random.nextInt(9, 14);
            CornSeedsSELL = random.nextInt(12, 16);
            PotatoSeedsSELL = random.nextInt(20, 30);
            AppleTreeSeedsSELL = random.nextInt(50, 120);

            milkSELL = random.nextInt(10, 20);
            foodForAnimalBUY = random.nextInt(50, 70);
            foodForAnimalSELL = random.nextInt(25, 50);
            eggSELL = random.nextInt(10, 20);

            potatoBUY = random.nextInt(10, 20);
            potatoSELL = random.nextInt(25, 50);
            appleBUY = random.nextInt(15, 25);
            appleSELL = random.nextInt(25, 80);



            System.out.println("    BUY:  ****************************************        SELL:        ****************************************      INFO:");
            // sell and buy #1
            System.out.print("1. Small Cow: " + smallCowBUY);
            System.out.print("                                     ");
            System.out.print("2. Small Cow: " + smallCowSELL);
            System.out.print("                                      ");
            System.out.print("Time to grow up: 25 weeks");
            // sell and buy #2
            System.out.println("");
            System.out.print("3. Small Horse: " + smallHorseBUY);
            System.out.print("                                   ");
            System.out.print("4. Small Horse: " + smallHorseSELL);
            System.out.print("                                    ");
            System.out.print("Time to grow up: 15 weeks");
            // sell and buy #3
            System.out.println("");
            System.out.print("5. Small Rabbit: " + smallRabbitBUY);
            System.out.print("                                  ");
            System.out.print("6. Small Rabbit: " + smallRabbitSELL);
            System.out.print("                                   ");
            System.out.print("Time to grow up: 13 weeks");
            // sell and buy #4
            System.out.println("");
            System.out.print("7. Small Chicken: " + smallChickenBUY);
            System.out.print("                                 ");
            System.out.print("8. Small Chicken: " + smallChickenSELL);
            System.out.print("                                  ");
            System.out.print("Time to grow up: 20 weeks");
            // sell and buy #5
            System.out.println("");
            System.out.print("9. Small Dog: " + smallDogBUY);
            System.out.print("                                     ");
            System.out.print("10. Small Dog: " + smallDogSELL);
            System.out.print("                                     ");
            System.out.print("Time to grow up: 10 weeks");
            System.out.println("");
            System.out.println("    ------------------------------------------------------------------------------------------------------------   ");


            // sell and buy #6

            System.out.print("11. Wheat Seed: " + WheatSeedsBUY);
            System.out.print("                                   ");
            System.out.print("12. Wheat Seed: " + WheatSeedsSELL);
            System.out.print("                                      ");
            System.out.print("One seed needs - 0.18 hectares to plant it / Time growing up - 40 weeks / it gives you 8 animal food");

            // sell and buy #7
            System.out.println("");
            System.out.print("13. Oat Seed: " + OatSeedsBUY);
            System.out.print("                                    ");
            System.out.print("14. Oat Seed: " + OatSeedsSELL);
            System.out.print("                                      ");
            System.out.print("One seed needs - 0.25 hectares to plant it / Time growing up - 25 weeks / it gives you 15 animal food");

            // sell and buy #8
            System.out.println("");
            System.out.print("15. Corn Seed: " + CornSeedsBUY);
            System.out.print("                                   ");
            System.out.print("16. Corn Seed: " + CornSeedsSELL);
            System.out.print("                                    ");
            System.out.print("One seed needs - 0.39 hectares to plant it / Time growing up - 60 weeks / it gives you 6 animal food");

            // sell and buy #9
            System.out.println("");
            System.out.print("17. Potato Seed: " + PotatoSeedsBUY);
            System.out.print("                                 ");
            System.out.print("18. Potato Seed: " + PotatoSeedsSELL);
            System.out.print("                                 ");
            System.out.print("One seed needs - 0.15 hectares to plant it / Time growing up - 80 weeks / it gives you 4 potatoes");

            // sell and buy #10
            System.out.println("");
            System.out.print("19. Apple Tree Seed: " + AppleTreeSeedsBUY);
            System.out.print("                                ");
            System.out.print("20. Apple Tree Seed: " + AppleTreeSeedsSELL);
            System.out.print("                                ");
            System.out.print("One seed needs - 0.54 hectares to plant it / Time growing up - 120 weeks / it gives you 15 apples");

            System.out.println("");


            System.out.println("    ------------------------------------------------------------------------------------------------------------   ");


            // sell and buy #10

            System.out.print("21. Big Cow: " + bigCowBUY);
            System.out.print("                                     ");
            System.out.print("22. Big Cow: " + bigCowSELL);
            System.out.print("                                     ");
            System.out.print("Chance to reproduce 30%");
            // sell and buy #11
            System.out.println("");
            System.out.print("23. Big Horse: " + bigHorseBUY);
            System.out.print("                                   ");
            System.out.print("24. Big Horse: " + bigHorseSELL);
            System.out.print("                                    ");
            System.out.print("Chance to reproduce 20%");
            // sell and buy #12
            System.out.println("");
            System.out.print("25. Big Rabbit: " + bigRabbitBUY);
            System.out.print("                                  ");
            System.out.print("26. Big Rabbit: " + bigRabbitSELL);
            System.out.print("                                   ");
            System.out.print("Chance to reproduce 60%");
            // sell and buy #13
            System.out.println("");
            System.out.print("27. Big Chicken: " + bigChickenBUY);
            System.out.print("                                 ");
            System.out.print("28. Big Chicken: " + bigChickenSELL);
            System.out.print("                                  ");
            System.out.print("Chance to reproduce 40%");
            // sell and buy #14
            System.out.println("");
            System.out.print("29. Big Dog: " + bigDogBUY);
            System.out.print("                                      ");
            System.out.print("30. Big Dog: " + bigDogSELL);
            System.out.print("                                      ");
            System.out.print("Chance to reproduce 40%");
            System.out.println("");
            System.out.println("    ------------------------------------------------------------------------------------------------------------   ");



            // sell and buy #16
            System.out.println("");
            System.out.print("31. Food For Animal: " + foodForAnimalBUY);
            System.out.print("                              ");
            System.out.print("32. Food For Animal: " + foodForAnimalSELL);

            System.out.println("");
            System.out.println("    ------------------------------------------------------------------------------------------------------------   ");

            // sell and buy #17
            System.out.println("");
            System.out.print("33. Potato: " + potatoBUY );
            System.out.print("                              ");
            System.out.print("34. Potato: " + potatoSELL );

            // sell and buy #18
            System.out.println("");
            System.out.print("35. Apple: " + appleBUY );
            System.out.print("                              ");
            System.out.print("36. Apple: " + appleSELL );




            System.out.println("");
            System.out.println("**************************************************************************************************************************");
            System.out.println("0. Exit Marketplace");
            alreadyOpenShop = true;


            System.out.println("I chose number: ");
            Scanner in = new Scanner(System.in);
            int choose = in.nextInt();

            // buy
            if (choose == 1) {
                if (maxAnimalsThatCanBuy > 0){
                    if (cash > smallCowBUY) {
                        System.out.println("Congratulations you bought it!");
                        priceTempBuy = priceTempBuy + smallCowBUY;
                        animalTempNumber = animalTempNumber +1;
                        tempsmallCowAnimal = 1;
                    } else {
                        System.out.println("Check your balance.");
                        return choose;
                    }
                } else {
                    System.out.println("You cant buy you dont have enough place for animals.");
                    return choose;
                }

            }
            else if (choose == 3){
                if (maxAnimalsThatCanBuy > 0){
                    if (cash > smallHorseBUY) {
                        System.out.println("Congratulations you bought it!");
                        priceTempBuy = priceTempBuy + smallHorseBUY;
                        animalTempNumber = animalTempNumber +1;
                        tempsmallHorseAnimal = 1;
                    } else {
                        System.out.println("Check your balance.");
                        return choose;
                    }
                }else {
                    System.out.println("You cant buy you dont have enough place for animals.");
                    return choose;
                }

            }
            else if (choose == 5){
                if (maxAnimalsThatCanBuy > 0){
                    if (cash > smallRabbitBUY) {
                        System.out.println("Congratulations you bought it!");
                        priceTempBuy = priceTempBuy + smallRabbitBUY;
                        animalTempNumber = animalTempNumber +1;
                        tempsmallRabbitAnimal = 1;
                    } else {
                        System.out.println("Check your balance.");
                        return choose;
                    }
                } else {
                    System.out.println("You cant buy you dont have enough place for animals.");
                    return choose;
                }

            }
            else if (choose == 7){
                if (maxAnimalsThatCanBuy > 0){
                    if (cash > smallChickenBUY) {

                        System.out.println("Congratulations you bought it!");
                        priceTempBuy = priceTempBuy + smallChickenBUY;
                        animalTempNumber = animalTempNumber +1;
                        tempsmallChickenAnimal = 1;
                    } else {
                        System.out.println("Check your balance.");
                        return choose;
                    }
                }else {
                    System.out.println("You cant buy you dont have enough place for animals.");
                    return choose;
                }

            }
            else if (choose == 9){
                if (maxAnimalsThatCanBuy > 0){
                    if (cash > smallDogBUY) {
                        System.out.println("Congratulations you bought it!");
                        priceTempBuy = priceTempBuy + smallDogBUY;
                        animalTempNumber = animalTempNumber +1;
                        tempsmallDogAnimal = 1;
                    } else {
                        System.out.println("Check your balance.");
                        return choose;



                    }
                }else {
                    System.out.println("You cant buy you dont have enough place for animals.");
                    return choose;
                }
            }


            else if (choose == 11){

                if (cash > WheatSeedsBUY) {

                    System.out.println("Congratulations you bought it!");
                    priceTempBuy = priceTempBuy + WheatSeedsBUY;
                    seedsTempNumber = seedsTempNumber+1;
                    tempWheatSeed = 1;



                } else {
                    System.out.println("Check your balance.");
                    return choose;

                }}
            else if (choose == 13){

                if (cash > OatSeedsBUY) {


                    System.out.println("Coongratulations you bought it!");
                    priceTempBuy = priceTempBuy + OatSeedsBUY;
                    seedsTempNumber = seedsTempNumber+1;
                    tempOatSeed = 1;



                } else {
                    System.out.println("Check your balance.");
                    return choose;

                }}
            else if (choose == 15){

                if (cash > CornSeedsBUY) {

                    System.out.println("Congratulations you bought it!");
                    priceTempBuy = priceTempBuy + CornSeedsBUY;
                    seedsTempNumber = seedsTempNumber+1;
                    tempCornSeed = 1;



                } else {
                    System.out.println("Check your balance.");
                    return choose;

                }}
            else if (choose == 17){

                if (cash > PotatoSeedsBUY) {

                    System.out.println("Congratulations you bought it!");
                    priceTempBuy = priceTempBuy + PotatoSeedsBUY;
                    seedsTempNumber = seedsTempNumber+1;
                    tempPotatoSeed = 1;




                } else {
                    System.out.println("Check your balance.");
                    return choose;

                }}
            else if (choose == 19){

                if (cash > AppleTreeSeedsBUY) {

                    System.out.println("Congratulations you bought it!");
                    priceTempBuy = priceTempBuy + AppleTreeSeedsBUY;
                    seedsTempNumber = seedsTempNumber+1;
                    tempAppleTreeSeed = 1;




                } else {
                    System.out.println("Check your balance.");
                    return choose;

                }}

            else if (choose == 21){
                if (maxAnimalsThatCanBuy > 0){
                    if (cash > bigCowBUY) {
                        System.out.println("Congratulations you bought it!");
                        priceTempBuy = priceTempBuy + bigCowBUY;
                        animalTempNumber = animalTempNumber +1;
                        tempbigCowAnimal = 1;
                    } else {
                        System.out.println("Check your balance.");
                        return choose;

                    }
                }else {
                    System.out.println("You cant buy you dont have enough place for animals.");
                    return choose;
                }
            }
            else if (choose == 23){
                if (maxAnimalsThatCanBuy > 0){
                    if (cash > bigHorseBUY) {

                        System.out.println("Congratulations you bought it!");
                        priceTempBuy = priceTempBuy + bigHorseBUY;
                        animalTempNumber = animalTempNumber +1;
                        tempbigHorseAnimal = 1;
                    } else {
                        System.out.println("Check your balance.");
                        return choose;

                    }
                }else {
                    System.out.println("You cant buy you dont have enough place for animals.");
                    return choose;
                }
            }
            else if (choose == 25){
                if (maxAnimalsThatCanBuy > 0){
                    if (cash > bigRabbitBUY) {

                        System.out.println("Congratulations you bought it!");
                        priceTempBuy = priceTempBuy + bigRabbitBUY;
                        animalTempNumber = animalTempNumber +1;
                        tempbigRabbitAnimal = 1;
                    } else {
                        System.out.println("Check your balance.");
                        return choose;

                    }
                }else {
                    System.out.println("You cant buy you dont have enough place for animals.");
                    return choose;
                }
            }
            else if (choose == 27){
                if (maxAnimalsThatCanBuy > 0){
                    if (cash > bigChickenBUY) {

                        System.out.println("Congratulations you bought it!");
                        priceTempBuy = priceTempBuy + bigChickenBUY;
                        animalTempNumber = animalTempNumber +1;
                        tempbigChickenAnimal = 1;
                    } else {
                        System.out.println("Check your balance.");
                        return choose;

                    }
                }else {
                    System.out.println("You cant buy you dont have enough place for animals.");
                    return choose;
                }
            }
            else if (choose == 29){
                if (maxAnimalsThatCanBuy > 0){
                    if (cash > bigDogBUY) {

                        System.out.println("Congratulations you bought it!");
                        priceTempBuy = priceTempBuy + bigDogBUY;
                        animalTempNumber = animalTempNumber +1;
                        tempbigDogAnimal = 1;
                    } else {
                        System.out.println("Check your balance.");
                        return choose;

                    }
                }else {
                    System.out.println("You cant buy you dont have enough place for animals.");
                    return choose;
                }
            }

            else if (choose == 31) {
                if (sizestorage>0){
                    if (cash > foodForAnimalBUY) {
                        System.out.println("Congratulations you bought it!");
                        priceTempBuy = priceTempBuy + foodForAnimalBUY;
                        tempFoodForAnimal = 1;

                    } else {
                        System.out.println("Check your balance.");
                        return choose;

                    }
                }else {
                    System.out.println("You dont have enough space for food.");
                }
            }

            //

            else if (choose == 33) {

                    if (cash > appleBUY ) {
                        System.out.println("Congratulations you bought it!");
                        priceTempBuy = priceTempBuy + potatoBUY  ;
                        tempPotato = 1;

                    } else {
                        System.out.println("Check your balance.");

                return choose;

            }
            }

            else if (choose == 35) {

                if (cash > appleBUY ) {
                    System.out.println("Congratulations you bought it!");
                    priceTempBuy = priceTempBuy + appleBUY ;
                    tempApple = 1;

                } else {
                    System.out.println("Check your balance.");
                    return choose;

                }

            }

            // sell

            else if (choose == 2){
                if (sizesmallCowAnimal>0){
                    tempsmallCowAnimal = -1;
                    priceTempSell = priceTempSell + smallCowSELL;
                    System.out.println("Congratulation you sell small cow for: " + priceTempSell);
                } else {
                    System.out.println("You dont have small cow");
                }
            }
            else if (choose == 4){
                if (sizesmallHorseAnimal>0){
                    tempsmallHorseAnimal = -1;
                    priceTempSell = priceTempSell + smallHorseSELL;
                    System.out.println("Congratulation you sell small horse for: " + priceTempSell);
                } else {
                    System.out.println("You dont have small horse");
                }
            }
            else if (choose == 8){
                if (sizesmallChickenAnimal>0){
                    tempsmallChickenAnimal = -1;
                    priceTempSell = priceTempSell + smallChickenSELL;
                    System.out.println("Congratulation you sell small chicken for: " + priceTempSell);
                } else {
                    System.out.println("You dont have small chicken");
                }
            }
            else if (choose == 10){
                if (sizesmallDogAnimal>0){
                    tempsmallDogAnimal = -1;
                    priceTempSell = priceTempSell + smallDogSELL;
                    System.out.println("Congratulation you sell small dog for: " + priceTempSell);

                } else {
                    System.out.println("You dont have small dog");
                }
            }
            else if (choose == 6){
                if (sizesmallRabbitAnimal>0){
                    tempsmallRabbitAnimal = -1;
                    priceTempSell = priceTempSell + smallRabbitSELL;
                    System.out.println("Congratulation you sell small rabbit for: " + priceTempSell);
                } else {
                    System.out.println("You dont have small rabbit");
                }
            }


            else if (choose == 12){
                if (sizeWheatSeed>0){
                    tempWheatSeed = -1;
                    priceTempSell = priceTempSell + WheatSeedsSELL;
                    System.out.println("Congratulation you sell wheat seed for: " + priceTempSell);
                } else {
                    System.out.println("You dont have wheat seed");
                }
            }
            else if (choose == 14){
                if (sizeOatSeed>0){
                    tempOatSeed = -1;
                    priceTempSell = priceTempSell + OatSeedsSELL;
                    System.out.println("Congratulation you sell oat seed for: " + priceTempSell);

                } else {
                    System.out.println("You dont have oat seed");
                }
            }
            else if (choose == 16){
                if (sizeCornSeed>0){
                    tempCornSeed = -1;
                    priceTempSell = priceTempSell + CornSeedsSELL;
                    System.out.println("Congratulation you sell corn seed for: " + priceTempSell);

                } else {
                    System.out.println("You dont have corn seed");
                }
            }
            else if (choose == 18){
                if (sizePotatoSeed>0){
                    tempPotatoSeed = -1;
                    priceTempSell = priceTempSell + PotatoSeedsSELL;
                    System.out.println("Congratulation you sell potato seed for: " + priceTempSell);

                } else {
                    System.out.println("You dont have Potato seed");
                }
            }
            else if (choose == 20){
                if (sizeAppleTreeSeed>0){
                    tempAppleTreeSeed = -1;
                    priceTempSell = priceTempSell + AppleTreeSeedsSELL;
                    System.out.println("Congratulation you sell potato seed for: " + priceTempSell);

                } else {
                    System.out.println("You dont have Apple Tree seeds");
                }
            }

            else if (choose == 22){
                if (sizebigCowAnimal>0){
                    tempbigCowAnimal = -1;
                    priceTempSell = priceTempSell + bigCowSELL;
                    System.out.println("Congratulation you sell big cow for: " + priceTempSell);

                } else {
                    System.out.println("You dont have big cow.");
                }
            }
            else if (choose == 24){
                if (sizebigHorseAnimal>0){
                    tempbigHorseAnimal = -1;
                    priceTempSell = priceTempSell + bigHorseSELL;
                    System.out.println("Congratulation you sell big horse for: " + priceTempSell);

                } else {
                    System.out.println("You dont have big horse");
                }
            }
            else if (choose == 26){
                if (sizebigRabbitsAnimal>0){
                    tempbigRabbitAnimal = -1;
                    priceTempSell = priceTempSell + bigRabbitSELL;
                    System.out.println("Congratulation you sell big rabbit for: " + priceTempSell);
                } else {
                    System.out.println("You dont have big Rabbit");
                }
            }
            else if (choose == 28){
                if (sizebigChickenAnimal>0){
                    tempbigChickenAnimal = -1;
                    priceTempSell = priceTempSell + bigChickenSELL;
                    System.out.println("Congratulation you sell big chicken for: " + priceTempSell);

                } else {
                    System.out.println("You dont have big chicken");
                }
            }
            else if (choose == 30){
                if (sizebigDogAnimal>0){
                    tempbigDogAnimal = -1;
                    priceTempSell = priceTempSell + bigDogSELL;
                    System.out.println("Congratulation you sell big dog for: " + priceTempSell);

                } else {
                    System.out.println("You dont have big dog");
                }
            }

            else if (choose == 32){
                if (actualfood>0){
                    tempFoodForAnimal = -1;
                    priceTempSell = priceTempSell + foodForAnimalSELL;
                    System.out.println("Congratulation you sell food for: " + priceTempSell);
                } else {
                    System.out.println("You dont have food for sell");
                }
            }

            //

            else if (choose == 34){
                if (actualPotato>0){
                    tempPotato = -1;
                    priceTempSell = priceTempSell + potatoSELL ;
                    System.out.println("Congratulation you sell potato for: " + priceTempSell);
                } else {
                    System.out.println("You dont have food for sell");
                }
            }



            else if (choose == 36){
                if (actualApple>0){
                    tempApple = -1;
                    priceTempSell = priceTempSell + appleSELL ;
                    System.out.println("Congratulation you sell apple for: " + priceTempSell);
                } else {
                    System.out.println("You dont have food for sell");
                }
            }


            else if (choose == 0){

                return choose;
            }
            else {
                System.out.println("Please dont brake the game.");
            }



        }

        return priceTempBuy;
    }

    public static boolean getAlreadyOpenShop() {
        return alreadyOpenShop;
    }

    public static void setAlreadyOpenShop() {
        alreadyOpenShop = false;
    }

    public static int getpriceTempBuy(){
        return priceTempBuy;
    }

    public static int getPriceTempSell(){
        return priceTempSell;
    }

    public static int getAnimalTempNumber(){
        return animalTempNumber;
    }

    public static int getseedsTempNumber(){
        return  seedsTempNumber;
    }

    //
    public static int gettempsmallCowAnimal(){return  tempsmallCowAnimal;}
    public static int gettempsmallHorseAnimal(){return  tempsmallHorseAnimal;}
    public static int gettempsmallDogAnimal(){return  tempsmallDogAnimal;}
    public static int gettempsmallChickenAnimal(){return  tempsmallChickenAnimal;}
    public static int gettempsmallRabbitAnimal(){return  tempsmallRabbitAnimal;}

    public static int gettempbigChickenAnimal(){return  tempbigChickenAnimal;}
    public static int gettempbigDogAnimal(){return  tempbigDogAnimal;}
    public static int gettempbigCowAnimal(){return  tempbigCowAnimal;}
    public static int gettempbigHorseAnimal(){return  tempbigHorseAnimal;}
    public static int gettempbigRabbitsAnimal(){return  tempbigRabbitAnimal;}

    public static int gettempWheatSeed(){return  tempWheatSeed;}
    public static int gettempOatSeed(){return  tempOatSeed;}
    public static int gettempCornSeed(){return  tempCornSeed;}
    public static int gettempPotatoSeed(){return  tempPotatoSeed;}
    public static int gettempAppleTreeSeed(){return  tempAppleTreeSeed;}

    public static int gettempFoodForAnimal(){return  tempFoodForAnimal;}

    public static int gettempPotato(){return tempPotato;}
    public static int gettempApple(){return tempApple;}
    //



    }



