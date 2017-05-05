package com.company;

import bridges.*;
import builder.HouseBuilder;
import builder.galustyan.DjamshutBuilder;
import builder.galustyan.RafshanBuilder;
import builder.svetlyakov.Boss;
import decorator.InternetTariff;
import decorator.MainTariff;
import decorator.RoamingTariff;
import decorator.SMSTariff;
import factory.mauser.MauserFactory;
import observer.HR;
import observer.Worker;

public class Main {

    public static void main(String[] args) {
	// write your code here





        BasicSocialWeb faceBookSocialWeb = new FacebookSocialWeb();
        ExtendedSocialWeb extendedSocialWeb = new ExtendedSocialWebAdapter(faceBookSocialWeb);

        Detective ded = new DetectiveAdapter(faceBookSocialWeb);
        Inspector ins = new IspectorClass(faceBookSocialWeb);

        System.out.println("HistoryCriminal    " + ded.getHistoryCriminal(1,"04.05.2017"));
        System.out.println("MoneyFromPeople    "+ ins.getMoneyFromPeople());


        System.out.println(
                extendedSocialWeb
                .getHistory(1, "04.05.2017")
                            );

        System.out.println(
                extendedSocialWeb
                        .getLikes(1,
                                true,
                                2)
        );


    }


    private static void testObserver()
    {
        HR hr = new HR();
        Worker worker1 = new Worker(1);
        Worker worker2 = new Worker(2);

        hr.registerObserver(worker1);
        hr.registerObserver(worker2);

        hr.notifyAllObservers();
    }

    private static void decoratorTest()
    {
        MainTariff mainTariff = new MainTariff();
        SMSTariff smsTariff = new SMSTariff(mainTariff);
        RoamingTariff roamingTariff = new RoamingTariff(smsTariff);
        InternetTariff internetTariff = new InternetTariff(smsTariff);

        internetTariff.processTariff();
    }


    private static void builderTest()
    {
        HouseBuilder houseBuilder = new DjamshutBuilder();
        Boss boss = new Boss(houseBuilder);
        boss.build();

    }



    private static void abstractFactoryTest()
    {
        MauserFactory factory = new MauserFactory();
        factory.createBFG();
        factory.createGun();
        factory.createRevolver();
        factory.createRifle();
    }


}
