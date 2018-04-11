package org.mendybot.noX;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.util.Locale;

public class MendyBotGraphicsEnvironment extends GraphicsEnvironment
{
  private GraphicsDevice device = new MendyGraphicsDevice();

  @Override
  public GraphicsDevice[] getScreenDevices() throws HeadlessException
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public GraphicsDevice getDefaultScreenDevice() throws HeadlessException
  {
    return device;
  }

  @Override
  public Graphics2D createGraphics(BufferedImage img)
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public Font[] getAllFonts()
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public String[] getAvailableFontFamilyNames()
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public String[] getAvailableFontFamilyNames(Locale l)
  {
    throw new RuntimeException("not implemented yet");
  }

}
