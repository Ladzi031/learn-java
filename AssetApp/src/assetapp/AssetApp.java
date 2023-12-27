
package assetapp;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import za.ac.tut.bl.AssetsManager;
import za.ac.tut.entity.Asset;

/*
 * @author Ladzani_fabian
 */
public class AssetApp {
    public static void main(String[] args) {
        Asset asset;
        AssetsManager assetsManager = new AssetsManager();
        Map<Integer, Asset> assets = new HashMap<>();
        File file = new File("storeAsset.txt");
        int option = userOption();
        while(option != 4)
        {
            switch (option) {
                case 1:
                    asset = createAsset();
                    Integer assetNumber = Integer.valueOf(asset.getSerialNo());
                    assetsManager.add(assetNumber, asset, assets);
                    break;
                case 2:
                {
                    try {
                        assetsManager.store(assets, file);
                    } catch (IOException ex) {
                        Logger.getLogger(AssetApp.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                    break;
                case 3:
                {
                    try {
                        Map<Integer, Asset> assetMap  =  assetsManager.getAssets(file);
                        display(assetMap);
                        
                    } catch (IOException ex) {
                        Logger.getLogger(AssetApp.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                    break;
                default:
                    System.out.println("please enter the correct term!");
            }
            option = userOption();
        }   
    }
    private static int userOption() {
        int option;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a ‘1’ to add an asset to a Map.\n" +
" Enter a ‘2’ to store the Map entries in a text file.\n" +
" Enter a ‘3’ to read the Map entries from the text file and display them.\n" +
" Enter a ‘4’ to end the program");
        option = sc.nextInt();
        
        return  option;
    }

    private static Asset createAsset() {
        Asset asset;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter serial number: ");
        String serialNo = sc.next();
        System.out.println("Enter description: ");
        String description = sc.next();
        
        asset = new Asset(serialNo, description);
        return asset;
    }
    private static void display(Map<Integer, Asset> assetMap) {   
        for (Map.Entry dataEntry : assetMap.entrySet()) {       
            System.out.println(dataEntry.getKey() +" "+ dataEntry.getValue());
            System.out.println("");
        }
    }
}