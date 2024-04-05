package com.ohgiraffers.section04.uses2;

import java.util.Scanner;

public class MusicMenu {
    private MusicManager musicManager = new MusicManager();
    private Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        while (true){
            System.out.println("========== 메뉴 ==========");
            System.out.println("1. 곡 추가");
            System.out.println("2. 곡 전체 조회");
            System.out.println("3. 정렬하여 조회");
            System.out.println("4. 가수명으로 검색");
            System.out.println("5. 곡명으로 검색");
            System.out.println("6. 곡 정보 수정");
            System.out.println("7. 곡 삭제");
            System.out.println("0. 프로그램 종료");

            System.out.println("메뉴 선택 : ");
            int result = sc.nextInt();

        }


    }
    public void addList(){
        System.out.println("== == == 곡 추가 == == ==");
        System.out.print("가수 입력 : ");
        String artist = sc.nextLine();
        System.out.print("제목 입력 : ");
        String music = sc.nextLine();



    }
}
