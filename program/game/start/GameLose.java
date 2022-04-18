package program.game.start;

import java.util.Scanner;
import java.util.Random;

public class GameLose {

    static Scanner input = new Scanner(System.in);
    // Reset
    public static final String RESET = "\033[0m";  // Text Reset

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    // Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

    // Underline
    public static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
    public static final String RED_UNDERLINED = "\033[4;31m";    // RED
    public static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
    public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
    public static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
    public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
    public static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
    public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE

    // Background
    public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    public static final String RED_BACKGROUND = "\033[41m";    // RED
    public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

    // High Intensity
    public static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
    public static final String RED_BRIGHT = "\033[0;91m";    // RED
    public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
    public static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE

    // Bold High Intensity
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

    // High Intensity backgrounds
    public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
    public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
    public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
    public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
    public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";   // WHITE

    public static void main(String[] args) throws InterruptedException {
        GameLoseCon();
    }
        public static void GameLoseCon() throws InterruptedException {
        //Banner::Change::Feature
        System.out.println("");
        System.out.println("");
        System.out.println(GREEN_BOLD_BRIGHT + "═══════════════════════════════╗" + RESET);
        System.out.println(YELLOW_BOLD_BRIGHT + "═══════════════════════╗       ║" + RESET);
        System.out.println(PURPLE_BOLD_BRIGHT + "═══════════════════════║═══════║════════════════════════The Number Game════════════════════════════════════════════|>" + RESET);
        System.out.println(RED_BOLD_BRIGHT + "═════|> PLEASE WAIT. <|" + RESET);
        int banner = (int)(Math.random() * 5) + 1;
        Thread.sleep(500);
        if(banner==1) {
            String art = CYAN_BOLD_BRIGHT + """		                                                                                                
                                    ███╗   ██╗██╗   ██╗███╗   ███╗██████╗ ███████╗██████╗     
                                    ████╗  ██║██║   ██║████╗ ████║██╔══██╗██╔════╝██╔══██╗    
                                    ██╔██╗ ██║██║   ██║██╔████╔██║██████╔╝█████╗  ██████╔╝    
                                    ██║╚██╗██║██║   ██║██║╚██╔╝██║██╔══██╗██╔══╝  ██╔══██╗   
                                    ██║ ╚████║╚██████╔╝██║ ╚═╝ ██║██████╔╝███████╗██║  ██║     
                                   ╔══╝ ╚═══╝ ╚═════╝ ╚═╝     ╚═╝╚═════╝ ╚══════╝╚═╝   ╚═╝                                                             
                                   ╚══╗         ██████╗  █████╗ ███╗   ███╗███████╗              
                                      ║        ██╔════╝ ██╔══██╗████╗ ████║██╔════╝              
                                      ║        ██║  ███╗███████║██╔████╔██║█████╗                
                                      ║        ██║   ██║██╔══██║██║╚██╔╝██║██╔══╝     ╔> Ng-NumberGame // GetReadyToPlay         
                                      ║        ╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗   ║
                                      ║         ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝   ║
                                      ║ ╔═══════> Bring Your Ideas Into Reality ══════╝              
                                      ╚═╝  
                                                                                                                                                    		
                           """ + RESET;
            for (int i = 0; i < art.length(); i++) {
                System.out.print(art.charAt(i));
                Thread.sleep(1);
            }
        }
        else if(banner==2) {
            String art = GREEN_BOLD_BRIGHT + """
                            ▐ ▄ ▄• ▄▌• ▌ ▄ ·. ▄▄▄▄· ▄▄▄ .▄▄▄ 
                           •█▌▐██▪██▌·██ ▐███▪▐█ ▀█▪▀▄.▀·▀▄ █·
                           ▐█▐▐▌█▌▐█▌▐█ ▌▐▌▐█·▐█▀▀█▄▐▀▀▪▄▐▀▀▄
                           ██▐█▌▐█▄█▌██ ██▌▐█▌██▄▪▐█▐█▄▄▌▐█•█▌
                           ▀▀ █▪ ▀▀▀ ▀▀  █▪▀▀▀·▀▀▀▀  ▀▀▀ .▀  ▀
                                ▄▄ •  ▄▄▄· • ▌ ▄ ·. ▄▄▄ .    
                               ▐█ ▀ ▪▐█ ▀█ ·██ ▐███▪▀▄.▀·    Bring Your Ideas Into Reality
                               ▄█ ▀█▄▄█▀▀█ ▐█ ▌▐▌▐█·▐▀▀▪▄    
                               ▐█▄▪▐█▐█ ▪▐▌██ ██▌▐█▌▐█▄▄▌    
                               ·▀▀▀▀  ▀  ▀ ▀▀  █▪▀▀▀ ▀▀▀    
                                                                                            
                           """ + RESET;
            for (int i = 0; i < art.length(); i++) {
                System.out.print(art.charAt(i));
                Thread.sleep(1);
            }
        }
        else if(banner==3) {
            String art = RED_BOLD_BRIGHT + """
                           888b    888                        888                             .d8888b.         d8888 888b     d888 8888888888
                           8888b   888                        888                            d88P  Y88b       d88888 8888b   d8888 888       
                           88888b  888                        888                            888    888      d88P888 88888b.d88888 888      
                           888Y88b 888 888  888 88888b.d88b.  88888b.   .d88b.  888d888      888            d88P 888 888Y88888P888 8888888   
                           888 Y88b888 888  888 888 "888 "88b 888 "88b d8P  Y8b 888P"        888  88888    d88P  888 888 Y888P 888 888       
                           888  Y88888 888  888 888  888  888 888  888 88888888 888          888    888   d88P   888 888  Y8P  888 888       
                           888   Y8888 Y88b 888 888  888  888 888 d88P Y8b.     888          Y88b  d88P  d8888888888 888   "   888 888       
                           888    Y888  "Y88888 888  888  888 88888P"   "Y8888  888           "Y8888P88 d88P     888 888       888 8888888888                                                                                                                                                                                                    
                                   >> Bring Your Ideas Into Reality
                                   
                           """ + RESET;
            for (int i = 0; i < art.length(); i++) {
                System.out.print(art.charAt(i));
                Thread.sleep(1);
            }
        }
        else if(banner==4) {
            String art = BLUE_BOLD_BRIGHT + """
                              ▄     ▄   █▀▄▀█ ███   ▄███▄   █▄▄▄▄       ▄▀  ██   █▀▄▀█ ▄███▄  
                               █     █  █ █ █ █  █  █▀   ▀  █  ▄▀     ▄▀    █ █  █ █ █ █▀   ▀ 
                           ██   █ █   █ █ ▄ █ █ ▀ ▄ ██▄▄    █▀▀▌      █ ▀▄  █▄▄█ █ ▄ █ ██▄▄   
                           █ █  █ █   █ █   █ █  ▄▀ █▄   ▄▀ █  █      █   █ █  █ █   █ █▄   ▄▀
                           █  █ █ █▄ ▄█    █  ███   ▀███▀     █        ███     █    █  ▀███▀  
                           █   ██  ▀▀▀    ▀                  ▀                █    ▀          
                                          Bring Your Ideas Into Reality      ▀   
                                                                                                                
                           """ + RESET;
            for (int i = 0; i < art.length(); i++) {
                System.out.print(art.charAt(i));
                Thread.sleep(1);
            }
        }
        else if(banner==5) {
            String art = PURPLE_BOLD_BRIGHT + """
                           .______  .____     ._____.___ ._______ ._______.______       ._____  .______  ._____.___ ._______
                           :      \\ |    |___ :         |: __   / : .____/: __   \\      :_ ___\\ :      \\ :         |: .____/
                           |       ||    |   ||   \\  /  ||  |>  \\ | : _/\\ |  \\____|     |   |___|   .   ||   \\  /  || : _/\\
                           |   |   ||    :   ||   |\\/   ||  |>   \\|   /  \\|   :  \\      |   /  ||   :   ||   |\\/   ||   /  \\
                           |___|   ||        ||___| |   ||_______/|_.: __/|   |___\\     |. __  ||___|   ||___| |   ||_.: __/
                               |___||. _____/       |___|            :/   |___|          :/ |. |    |___|      |___|   :/  
                                     :/                                                  :   :/                            
                                     :          Bring Your Ideas Into Reality                :                                                                                                                                                                                                                              
                           
                           """ + RESET;
            for (int i = 0; i < art.length(); i++) {
                System.out.print(art.charAt(i));
                Thread.sleep(1);
            }
        }
        //Users::Input::Computers::Random
        System.out.println(PURPLE_BOLD_BRIGHT + "|> Random First Bet <|" + RESET);
        Thread.sleep(1500);
        int firstpick = (int)(Math.random() * 2) + 1;
        Thread.sleep(1000);

        if(firstpick==1) {
            Health Hp = new Health();
            Hp.setHealth(5);
            Thread.sleep(1000);
            System.out.println(RED_BOLD_BRIGHT + "|> Your The First One Who will Pick A Number <|" + RESET);
            Thread.sleep(1000);
            System.out.print(CYAN_BOLD_BRIGHT + "|> Please Bet A Number: " + RESET);
            int userbet = (input.nextInt());
            System.out.println(RED_BOLD_BRIGHT + "|> Please Wait, Computer is now picking <|" + RESET);
            Thread.sleep(2000);
            int compbet = (int)(Math.random() * 999) + 1;
            //Conditionals::Userbet<->Compbet
            if(userbet>compbet) /* Win */ {
                win();
            }
            if(userbet<compbet) /* Lose */ {
                lose();
            }
            if(userbet==compbet) /* Tie */ {
                tie();
            }
        }
        else if(firstpick==2) {
            System.out.println(RED_BOLD_BRIGHT + "|> Please Wait, Computer is now picking <|" + RESET);
            int compbet = (int)(Math.random() * 999) + 1;
            Thread.sleep(2000);
            System.out.println(RED_BOLD_BRIGHT + "|> Your the Last One Who Will Pick A Number <|" + RESET);
            Thread.sleep(1500);
            System.out.print(CYAN_BOLD_BRIGHT + "|> Please Bet A Number: " + RESET);
            int userbet = (input.nextInt());
            //Conditionals::Userbet<->Compbet
            if(userbet>compbet) /* Win */ {
                win();
            }
            if(userbet<compbet) /* Lose */ {
                lose();
            }
            if(userbet==compbet) /* Tie */ {
                tie();
            }
        }
        //Conditionals::SeparatedMethods
    }
    public static void win() throws InterruptedException {
        Health win = new Health();
        win.setHealth(5);
        System.out.println("");
        //Break
        System.out.println(RED_BOLD_BRIGHT + "  |> WIN! <|" + RESET);
        //GameNotice
        System.out.println("");
        String answer;
        String wintext[] = {
                GREEN_BOLD_BRIGHT + "|> Computer: I only want to see whether you will let me win this game, or beat it." + RESET,
                GREEN_BOLD_BRIGHT + "|> Computer: You win your battles or I'll destroy you!" + RESET,
                GREEN_BOLD_BRIGHT + "|> Computer: It is not difficult to capture a fortress but it is difficult to win a RandomGame." + RESET,
                GREEN_BOLD_BRIGHT + "|> Computer: What did you win in your deal about me?" + RESET,
                GREEN_BOLD_BRIGHT + "|> Computer: You really want to win this bet, don't you? haha Congrats!" + RESET,
                GREEN_BOLD_BRIGHT + "|> Computer: Harold is the one who created me, he say's that you temporarily win this game" + RESET,
                GREEN_BOLD_BRIGHT + "|> Computer: After you beat me and win the game, there's no way you can fire me again." + RESET,
                GREEN_BOLD_BRIGHT + "|> Computer: You thinking you're gonna win this game, haha you're right" + RESET,
                GREEN_BOLD_BRIGHT + "|> Computer: You know you can't win a battle without me. you against AI, stupid" + RESET};
        System.out.println(wintext[new Random().nextInt(wintext.length)]);

        System.out.print(RED_BOLD_BRIGHT + "|> [Y/N]Play Again?: " + RESET);
        answer = input.next();
        if(answer.equals("Y") || answer.equals("y")) {
            GameContinue.game();
        }
        else if(answer.equals("N") || answer.equals("n")) {
            System.exit(0);
        }
    }
    public static void lose() throws InterruptedException {
        Health win = new Health();
        win.setHealth(4);
        /* String Question for Loops */
        String answer;
        System.out.println("");
        //Break
        System.out.println(RED_BOLD_BRIGHT + "  |> LOSE <|" + RESET);
        System.out.println(RED_BOLD_BRIGHT + "|> HEALTH: 4 <|" + RESET);
        //GameNotice
        System.out.println("");
        String losetext[] = {
                GREEN_BOLD_BRIGHT + "|> Computer: It seems weird, you totally feel like the loser." + RESET,
                GREEN_BOLD_BRIGHT + "|> Computer: Obnoxious loser!" + RESET,
                GREEN_BOLD_BRIGHT + "|> Computer: The game participants take turns spinning the bottle and the loser? has to kiss the ghoul in front of everyone else." + RESET,
                GREEN_BOLD_BRIGHT + "|> Computer: Think you know your Biggest Loser trivia?" + RESET,
                GREEN_BOLD_BRIGHT + "|> Computer: you're was The Biggest Loser in season." + RESET,
                GREEN_BOLD_BRIGHT + "|> Computer: Harold is the one who created me, he say's that you temporarily lose this game" + RESET,
                GREEN_BOLD_BRIGHT + "|> Computer: The Biggest Loser has been around since 2022." + RESET,
                GREEN_BOLD_BRIGHT + "|> Computer: You thinking you're gonna win this game, not today stupid!" + RESET,
                GREEN_BOLD_BRIGHT + "|> Computer: Jillian Michaels has appeared on numerous talk shows to promote both The Biggest Loser and maybe it's you. :)" + RESET};
        System.out.println(losetext[new Random().nextInt(losetext.length)]);
        //Sleep::Continue::Game:Start
        Thread.sleep(500);
        //Sleep::Continue::Game::End
        System.out.println(RED_BOLD_BRIGHT + "|> Please Wait, Computer is now picking <|" + RESET);
        int compbet = (int)(Math.random() * 999) + 1;
        Thread.sleep(2000);
        System.out.println(RED_BOLD_BRIGHT + "|> Pick A Number <|" + RESET);
        Thread.sleep(1500);
        System.out.print(CYAN_BOLD_BRIGHT + "|> Please Bet A Number: " + RESET);
        int userbet = (input.nextInt());
        //Conditionals::Userbet<->Compbet
        if(userbet>compbet) /* Win */ {
            win();
        }
        if(userbet<compbet) /* Lose */ {
            System.out.println("");
            //Break
            System.out.println(RED_BOLD_BRIGHT + "  |> LOSE <|" + RESET);
            System.out.println(RED_BOLD_BRIGHT + "|> HEALTH: 3 <|" + RESET);
            //GameNotice
            System.out.println("");
            String losetext1[] = {
                    GREEN_BOLD_BRIGHT + "|> Computer: It seems weird, you totally feel like the loser." + RESET,
                    GREEN_BOLD_BRIGHT + "|> Computer: Obnoxious loser!" + RESET,
                    GREEN_BOLD_BRIGHT + "|> Computer: The game participants take turns spinning the bottle and the loser? has to kiss the ghoul in front of everyone else." + RESET,
                    GREEN_BOLD_BRIGHT + "|> Computer: Think you know your Biggest Loser trivia?" + RESET,
                    GREEN_BOLD_BRIGHT + "|> Computer: you're was The Biggest Loser in season." + RESET,
                    GREEN_BOLD_BRIGHT + "|> Computer: Harold is the one who created me, he say's that you temporarily lose this game" + RESET,
                    GREEN_BOLD_BRIGHT + "|> Computer: The Biggest Loser has been around since 2022." + RESET,
                    GREEN_BOLD_BRIGHT + "|> Computer: You thinking you're gonna win this game, not today stupid!" + RESET,
                    GREEN_BOLD_BRIGHT + "|> Computer: Jillian Michaels has appeared on numerous talk shows to promote both The Biggest Loser and maybe it's you. :)" + RESET};
            System.out.println(losetext[new Random().nextInt(losetext.length)]);

            //Sleep::Continue::Game:Start
            Thread.sleep(500);
            //Sleep::Continue::Game::End
            System.out.println(RED_BOLD_BRIGHT + "|> Please Wait, Computer is now picking <|" + RESET);
            int compbet1 = (int)(Math.random() * 999) + 1;
            Thread.sleep(2000);
            System.out.println(RED_BOLD_BRIGHT + "|> Pick A Number <|" + RESET);
            Thread.sleep(1500);
            System.out.print(CYAN_BOLD_BRIGHT + "|> Please Bet A Number: " + RESET);
            int userbet1 = (input.nextInt());

            if(userbet1<compbet1) {
                System.out.println("");
                //Break
                System.out.println(RED_BOLD_BRIGHT + "  |> LOSE <|" + RESET);
                System.out.println(RED_BOLD_BRIGHT + "|> HEALTH: 2 <|" + RESET);
                //GameNotice
                System.out.println("");
                String losetext2[] = {
                        GREEN_BOLD_BRIGHT + "|> Computer: It seems weird, you totally feel like the loser." + RESET,
                        GREEN_BOLD_BRIGHT + "|> Computer: Obnoxious loser!" + RESET,
                        GREEN_BOLD_BRIGHT + "|> Computer: The game participants take turns spinning the bottle and the loser? has to kiss the ghoul in front of everyone else." + RESET,
                        GREEN_BOLD_BRIGHT + "|> Computer: Think you know your Biggest Loser trivia?" + RESET,
                        GREEN_BOLD_BRIGHT + "|> Computer: you're was The Biggest Loser in season." + RESET,
                        GREEN_BOLD_BRIGHT + "|> Computer: Harold is the one who created me, he say's that you temporarily lose this game" + RESET,
                        GREEN_BOLD_BRIGHT + "|> Computer: The Biggest Loser has been around since 2022." + RESET,
                        GREEN_BOLD_BRIGHT + "|> Computer: You thinking you're gonna win this game, not today stupid!" + RESET,
                        GREEN_BOLD_BRIGHT + "|> Computer: Jillian Michaels has appeared on numerous talk shows to promote both The Biggest Loser and maybe it's you. :)" + RESET};
                System.out.println(losetext[new Random().nextInt(losetext.length)]);

                //Sleep::Continue::Game:Start
                Thread.sleep(500);
                //Sleep::Continue::Game::End
                System.out.println(RED_BOLD_BRIGHT + "|> Please Wait, Computer is now picking <|" + RESET);
                int compbet2 = (int)(Math.random() * 999) + 1;
                Thread.sleep(2000);
                System.out.println(RED_BOLD_BRIGHT + "|> Pick A Number <|" + RESET);
                Thread.sleep(1500);
                System.out.print(CYAN_BOLD_BRIGHT + "|> Please Bet A Number: " + RESET);
                int userbet2 = (input.nextInt());

                if(userbet2<compbet2) {
                    System.out.println("");
                    //Break
                    System.out.println(RED_BOLD_BRIGHT + "  |> LOSE <|" + RESET);
                    System.out.println(RED_BOLD_BRIGHT + "|> HEALTH: 1 <|" + RESET);
                    //GameNotice
                    System.out.println("");
                    String losetext3[] = {
                            GREEN_BOLD_BRIGHT + "|> Computer: It seems weird, you totally feel like the loser." + RESET,
                            GREEN_BOLD_BRIGHT + "|> Computer: Obnoxious loser!" + RESET,
                            GREEN_BOLD_BRIGHT + "|> Computer: The game participants take turns spinning the bottle and the loser? has to kiss the ghoul in front of everyone else." + RESET,
                            GREEN_BOLD_BRIGHT + "|> Computer: Think you know your Biggest Loser trivia?" + RESET,
                            GREEN_BOLD_BRIGHT + "|> Computer: you're was The Biggest Loser in season." + RESET,
                            GREEN_BOLD_BRIGHT + "|> Computer: Harold is the one who created me, he say's that you temporarily lose this game" + RESET,
                            GREEN_BOLD_BRIGHT + "|> Computer: The Biggest Loser has been around since 2022." + RESET,
                            GREEN_BOLD_BRIGHT + "|> Computer: You thinking you're gonna win this game, not today stupid!" + RESET,
                            GREEN_BOLD_BRIGHT + "|> Computer: Jillian Michaels has appeared on numerous talk shows to promote both The Biggest Loser and maybe it's you. :)" + RESET};
                    System.out.println(losetext[new Random().nextInt(losetext.length)]);

                    //Sleep::Continue::Game:Start
                    Thread.sleep(500);
                    //Sleep::Continue::Game::End
                    System.out.println(RED_BOLD_BRIGHT + "|> Please Wait, Computer is now picking <|" + RESET);
                    int compbet3 = (int)(Math.random() * 999) + 1;
                    Thread.sleep(2000);
                    System.out.println(RED_BOLD_BRIGHT + "|> Pick A Number <|" + RESET);
                    Thread.sleep(1500);
                    System.out.print(CYAN_BOLD_BRIGHT + "|> Please Bet A Number: " + RESET);
                    int userbet3 = (input.nextInt());

                    if(userbet2<compbet2) {
                        System.out.println("");
                        System.out.println(RED_BOLD_BRIGHT + ">| Out Of Lives <|" + RESET);
                        System.out.print(RED_BOLD_BRIGHT + "|> [Y/N]Play Again?: " + RESET);
                        answer = input.next();
                        if(answer.equals("Y") || answer.equals("y")) {
                            GameContinue.game();
                        }
                        else if(answer.equals("N") || answer.equals("n")) {
                            System.exit(0);
                        }
                    }
                }
                else if(userbet>compbet || userbet1>compbet1 || userbet2>compbet2) {
                  win();
                }
            }
        }

        if(userbet==compbet) /* Tie */ {
            tie();
        }
    }
    public static void tie() throws InterruptedException {
        /* String Question for Loops */
        String answer;
        System.out.println("");
        //Break
        System.out.println(RED_BOLD_BRIGHT + " |> TIE SCORES <|" + RESET);
        System.out.println(RED_BOLD_BRIGHT + " |> HEALTH: 5 <|" + RESET);
        //GameNotice
        System.out.println("");
        String tietext[] = {
                GREEN_BOLD_BRIGHT + "|> Computer: dead-heat, TIE" + RESET,
                GREEN_BOLD_BRIGHT + "|> Computer: You win your battles or I'll destroy you!" + RESET,
                GREEN_BOLD_BRIGHT + "|> Computer: It is not difficult to capture a fortress but it is difficult to win a RandomGame." + RESET,
                GREEN_BOLD_BRIGHT + "|> Computer: What did you win in your deal about me?" + RESET,
                GREEN_BOLD_BRIGHT + "|> Computer: You really want to win this bet, don't you? haha Congrats!" + RESET,
                GREEN_BOLD_BRIGHT + "|> Computer: Harold is the one who created me, he say's that you temporarily win this game" + RESET,
                GREEN_BOLD_BRIGHT + "|> Computer: After you beat me and win the game, there's no way you can fire me again." + RESET,
                GREEN_BOLD_BRIGHT + "|> Computer: You thinking you're gonna win this game, haha you're right" + RESET,
                GREEN_BOLD_BRIGHT + "|> Computer: You know you can't win a battle without me. you against AI, stupid" + RESET};
        System.out.println(tietext[new Random().nextInt(tietext.length)]);

        Health win = new Health();
        win.setHealth(5);
        System.out.print(RED_BOLD_BRIGHT + "|> [Y/N]Play Again?: " + RESET);
        answer = (input.next());
        if(answer.equals("Y") || answer.equals("y")) {
            GameContinue.game();
        }
        else if(answer.equals("N") || answer.equals("n")) {
            System.exit(0);
        }
    }
}
