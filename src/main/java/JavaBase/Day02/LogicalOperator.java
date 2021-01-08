package JavaBase.Day02;

import JavaBase.Loggging.Log;

import java.util.logging.Logger;

public class LogicalOperator {
  public static void main(String[] args) {
    Logger logger = Log.getLOG();
    String logicalOperationResult = "";

    boolean b1 = true;
    boolean b2 = false;
    boolean b3 = true;

    logicalOperationResult = String.format("%b, %b", b1 && b2, b1 && b3);
    logger.info(logicalOperationResult);

    logicalOperationResult = String.format("%b, %b %b", b1 || b2, b1 || b2, b2 || b2);
    logger.info(logicalOperationResult);

    logicalOperationResult = String.format("%b, %b", b1 ^ b2, b1 ^ b3);
    logger.info(logicalOperationResult);

  }
}
