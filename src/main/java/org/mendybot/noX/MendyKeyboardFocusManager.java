package org.mendybot.noX;

import java.awt.Component;
import java.awt.Window;
import java.awt.peer.KeyboardFocusManagerPeer;

public class MendyKeyboardFocusManager implements KeyboardFocusManagerPeer
{

  @Override
  public void setCurrentFocusedWindow(Window win)
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public Window getCurrentFocusedWindow()
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public void setCurrentFocusOwner(Component comp)
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public Component getCurrentFocusOwner()
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public void clearGlobalFocusOwner(Window activeWindow)
  {
    throw new RuntimeException("not implemented yet");
  }

}
