package org.mendybot.noX;

import static org.junit.Assert.*;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MendyBotGraphicsEnvironmentTest
{

  @BeforeClass
  public static void setUpBeforeClass() throws Exception
  {
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception
  {
  }

  @Before
  public void setUp() throws Exception
  {
  }

  @After
  public void tearDown() throws Exception
  {
  }

  @Test
  public final void test()
  {
    System.setProperty("java.awt.graphicsenv", "org.mendybot.noX.MendyBotGraphicsEnvironment");
    System.setProperty("awt.toolkit", "org.mendybot.noX.MendyBotToolkit");
    
    JFrame frame = new JFrame();

    JPanel p = new JPanel();
    frame.add(p, BorderLayout.CENTER);
    
    JButton bGo = new JButton("GO");
    p.add(bGo);
    
    frame.setVisible(true);
    Thread.yield();
  }

}
