import java.util.ArrayList;
import java.io.*;

public class Memory {

  static ArrayList<Byte> memory = new ArrayList<Byte>();

  static int permanentRegsInUse = 0;
  static int temporaryRegsInUse = 0;
  static ArrayList<Integer> registerBin = new ArrayList<Integer>();

  static int labelsInUse = 0;

  static public int allocateString(String text)
  {
    int addr = memory.size();
    int size = text.length();
    for (int i=0; i<size; i++) {
      memory.add(new Byte("", text.charAt(i)));
    }
    memory.add(new Byte("", 0));
    return addr;
  }

  static public void dumpData(PrintStream o)
  {
    Byte b;
    String s;
    int c;
    int size = memory.size();
    for (int i=0; i<size; i++) {
      b = memory.get(i);
      c = b.getContents();
      if (c >= 32) {
        s = String.valueOf((char)c);
      }
      else {
        s = ""; // "\\"+String.valueOf(c);
      }
      o.println("DATA "+c+" ; "+s+" "+b.getName());
    }
  }


  // Adds defined variable's registers
  static public int addRegister(int type)
  {
    permanentRegsInUse++;
    return permanentRegsInUse;
  }

  // Finds a temporary register to use
  static public int addRegister()
  {
    // Try and find a disused register
    if (registerBin.size() > 0)
    {
      return registerBin.remove(registerBin.size()-1);
    }

    // Otherwise make a new one
    temporaryRegsInUse++;
    return permanentRegsInUse + temporaryRegsInUse;
  }

  // Finished with a particular register
  static public void dumpRegister(String reg)
  {
    if (Integer.parseInt(reg)>permanentRegsInUse) registerBin.add(Integer.parseInt(reg));
  }



  static public int addLabel()
  {
    labelsInUse++;
    return labelsInUse;
  }
}

class Byte {
  String varname;
  int contents;

  Byte(String n, int c)
  {
    varname = n;
    contents = c;
  }

  String getName()
  {
    return varname;
  }

  int getContents()
  {
    return contents;
  }
}
