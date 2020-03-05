package epamcom.ExceptionHandling;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Constructor {


private static final Logger LOGGER = LogManager.getLogger(SimpleInterest.class);
public static void Estimation() {
Scanner scan = new Scanner(System.in);
LOGGER.error("Choose one from the available materials..\n1. Construction with Standard materials\n2. Construction with above standard materials\n3. Construction with High standard materials\n4. Construction with High standard materials and fully automated home");
try {
int c = scan.nextInt();
double HArea;
switch(c) {
case 1:
LOGGER.error("Enter area of house in sqfts: ");
HArea = scan.nextDouble();
LOGGER.error("Total Cost Estimated is " + (1200 * HArea)+ "Rs");
break;
case 2:
LOGGER.error("Enter area of house in sqfts: ");
HArea = scan.nextDouble();
LOGGER.error("Total Cost Estimated is " + (1500 * HArea)+"Rs");
break;
case 3:
LOGGER.error("Enter area of house in sqfts: ");
HArea = scan.nextDouble();
LOGGER.error("Total Cost Estimated is " +(1800 * HArea)+"Rs");
break;
case 4:
LOGGER.error("Enter  area of house in sqfts: ");
HArea = scan.nextDouble();
LOGGER.error("Total Cost Estimated is " +(2500 * HArea)+"Rs");
break;
default:
LOGGER.error("Select");
}
} catch (Exception e) {
LOGGER.error("Invalid!");

}
}

