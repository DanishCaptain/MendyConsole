package org.mendybot.noX;

public class MendyConsole
{
  public MendyConsole()
  {
    System.setProperty("java.awt.graphicsenv", "org.mendybot.gtk.MendyBotGraphicsEnvironment");
    System.setProperty("awt.toolkit", "org.mendybot.gtk.MendyBotToolkit");
  }
  
}
