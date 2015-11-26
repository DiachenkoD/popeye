/* Generated By:JavaCC: Do not edit this line. CodeScannerTokenManager.java */
/**
  * it should be a fault-tolerant java parser, hopefully
  */

  package net.sf.langproper.scanner.java ;
import java.io.Reader ;
import net.sf.langproper.scanner.* ;

public class CodeScannerTokenManager implements CodeScannerConstants
{
  public static  java.io.PrintStream debugStream = System.out;
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x400000L) != 0L)
            return 85;
         if ((active0 & 0x140L) != 0L)
         {
            jjmatchedKind = 30;
            return 84;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private final int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private final int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private final int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 40:
         return jjStopAtPos(0, 23);
      case 41:
         return jjStopAtPos(0, 24);
      case 44:
         return jjStopAtPos(0, 31);
      case 46:
         return jjStartNfaWithStates_0(0, 22, 85);
      case 47:
         return jjMoveStringLiteralDfa1_0(0x140L);
      case 123:
         return jjStopAtPos(0, 25);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private final int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(1, 8, 82);
         break;
      case 47:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(1, 6);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private final void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private final void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private final void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}
static private final void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}
static private final void jjCheckNAddStates(int start)
{
   jjCheckNAdd(jjnextStates[start]);
   jjCheckNAdd(jjnextStates[start + 1]);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec3 = {
   0x1ff00000fffffffeL, 0xffffffffffffc000L, 0xffffffffL, 0x600000000000000L
};
static final long[] jjbitVec4 = {
   0x0L, 0x0L, 0x0L, 0xff7fffffff7fffffL
};
static final long[] jjbitVec5 = {
   0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec6 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffL, 0x0L
};
static final long[] jjbitVec7 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0x0L, 0x0L
};
static final long[] jjbitVec8 = {
   0x3fffffffffffL, 0x0L, 0x0L, 0x0L
};
static private final int jjMoveNfa_0(int startState, int curPos)
{
   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 85;
   int i = 1;
   jjstateSet[0] = startState;
   int j, kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 85:
                  if ((0x3ff401000000000L & l) != 0L)
                  {
                     if (kind > 27)
                        kind = 27;
                     jjCheckNAdd(47);
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 18)
                        kind = 18;
                     jjCheckNAddStates(0, 2);
                  }
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(3, 9);
                  else if ((0x5800a46000000000L & l) != 0L)
                  {
                     if (kind > 30)
                        kind = 30;
                  }
                  else if ((0xa400080200000000L & l) != 0L)
                  {
                     if (kind > 26)
                        kind = 26;
                     jjCheckNAddTwoStates(39, 45);
                  }
                  else if ((0x401000000000L & l) != 0L)
                  {
                     if (kind > 27)
                        kind = 27;
                     jjCheckNAdd(47);
                  }
                  else if (curChar == 34)
                     jjCheckNAddStates(10, 13);
                  else if (curChar == 39)
                     jjAddStates(14, 16);
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 13)
                        kind = 13;
                     jjCheckNAddTwoStates(1, 2);
                  }
                  else if (curChar == 47)
                     jjCheckNAddTwoStates(84, 49);
                  else if (curChar == 48)
                  {
                     if (kind > 13)
                        kind = 13;
                     jjCheckNAddStates(17, 19);
                  }
                  else if (curChar == 45)
                     jjCheckNAddTwoStates(61, 49);
                  else if (curChar == 38)
                     jjCheckNAddTwoStates(59, 49);
                  else if (curChar == 42)
                     jjCheckNAdd(49);
                  else if (curChar == 43)
                     jjstateSet[jjnewStateCnt++] = 55;
                  else if (curChar == 62)
                     jjCheckNAdd(49);
                  else if (curChar == 60)
                     jjCheckNAdd(49);
                  else if (curChar == 61)
                     jjCheckNAdd(49);
                  else if (curChar == 46)
                     jjCheckNAdd(4);
                  break;
               case 84:
                  if (curChar == 61)
                  {
                     if (kind > 30)
                        kind = 30;
                  }
                  else if (curChar == 42)
                     jjstateSet[jjnewStateCnt++] = 82;
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 13)
                     kind = 13;
                  jjCheckNAddTwoStates(1, 2);
                  break;
               case 3:
                  if (curChar == 46)
                     jjCheckNAdd(4);
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  jjCheckNAddStates(0, 2);
                  break;
               case 6:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(7);
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  jjCheckNAddTwoStates(7, 8);
                  break;
               case 9:
                  if (curChar == 39)
                     jjAddStates(14, 16);
                  break;
               case 10:
                  if ((0xffffff7fffffdbffL & l) != 0L)
                     jjCheckNAdd(11);
                  break;
               case 11:
                  if (curChar == 39 && kind > 20)
                     kind = 20;
                  break;
               case 13:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAdd(11);
                  break;
               case 14:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(15, 11);
                  break;
               case 15:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(11);
                  break;
               case 16:
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 17:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(15);
                  break;
               case 19:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 20:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 21:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 22:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAdd(11);
                  break;
               case 24:
                  if (curChar == 34)
                     jjCheckNAddStates(10, 13);
                  break;
               case 25:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddStates(10, 13);
                  break;
               case 27:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(10, 13);
                  break;
               case 29:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 30:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 31;
                  break;
               case 31:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 32;
                  break;
               case 32:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(10, 13);
                  break;
               case 34:
                  if (curChar == 34 && kind > 21)
                     kind = 21;
                  break;
               case 35:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(20, 24);
                  break;
               case 36:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(10, 13);
                  break;
               case 37:
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 38;
                  break;
               case 38:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(36);
                  break;
               case 39:
                  if ((0xa400080200000000L & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  jjCheckNAddTwoStates(39, 45);
                  break;
               case 46:
                  if ((0x401000000000L & l) == 0L)
                     break;
                  if (kind > 27)
                     kind = 27;
                  jjCheckNAdd(47);
                  break;
               case 47:
                  if ((0x3ff401000000000L & l) == 0L)
                     break;
                  if (kind > 27)
                     kind = 27;
                  jjCheckNAdd(47);
                  break;
               case 48:
                  if ((0x5800a46000000000L & l) != 0L && kind > 30)
                     kind = 30;
                  break;
               case 49:
                  if (curChar == 61 && kind > 30)
                     kind = 30;
                  break;
               case 50:
                  if (curChar == 61)
                     jjCheckNAdd(49);
                  break;
               case 51:
                  if (curChar == 60)
                     jjCheckNAdd(49);
                  break;
               case 52:
                  if (curChar == 62)
                     jjCheckNAdd(49);
                  break;
               case 55:
                  if (curChar == 43 && kind > 30)
                     kind = 30;
                  break;
               case 56:
                  if (curChar == 43)
                     jjstateSet[jjnewStateCnt++] = 55;
                  break;
               case 57:
                  if (curChar == 42)
                     jjCheckNAdd(49);
                  break;
               case 58:
                  if (curChar == 38)
                     jjCheckNAddTwoStates(59, 49);
                  break;
               case 59:
                  if (curChar == 38 && kind > 30)
                     kind = 30;
                  break;
               case 60:
                  if (curChar == 45)
                     jjCheckNAddTwoStates(61, 49);
                  break;
               case 61:
                  if (curChar == 45 && kind > 30)
                     kind = 30;
                  break;
               case 62:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(3, 9);
                  break;
               case 63:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(63, 64);
                  break;
               case 64:
                  if (curChar != 46)
                     break;
                  if (kind > 18)
                     kind = 18;
                  jjCheckNAddStates(25, 27);
                  break;
               case 65:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  jjCheckNAddStates(25, 27);
                  break;
               case 67:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(68);
                  break;
               case 68:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  jjCheckNAddTwoStates(68, 8);
                  break;
               case 69:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(69, 70);
                  break;
               case 71:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(72);
                  break;
               case 72:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  jjCheckNAddTwoStates(72, 8);
                  break;
               case 73:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(28, 30);
                  break;
               case 75:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(76);
                  break;
               case 76:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(76, 8);
                  break;
               case 77:
                  if (curChar != 48)
                     break;
                  if (kind > 13)
                     kind = 13;
                  jjCheckNAddStates(17, 19);
                  break;
               case 79:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 13)
                     kind = 13;
                  jjCheckNAddTwoStates(79, 2);
                  break;
               case 80:
                  if ((0xff000000000000L & l) == 0L)
                     break;
                  if (kind > 13)
                     kind = 13;
                  jjCheckNAddTwoStates(80, 2);
                  break;
               case 81:
                  if (curChar == 47)
                     jjCheckNAddTwoStates(84, 49);
                  break;
               case 82:
                  if (curChar == 42)
                     jjstateSet[jjnewStateCnt++] = 83;
                  break;
               case 83:
                  if ((0xffff7fffffffffffL & l) != 0L && kind > 7)
                     kind = 7;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 85:
               case 47:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 27)
                     kind = 27;
                  jjCheckNAdd(47);
                  break;
               case 0:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 27)
                        kind = 27;
                     jjCheckNAdd(47);
                  }
                  else if ((0x7000000068000000L & l) != 0L)
                  {
                     if (kind > 30)
                        kind = 30;
                  }
                  if (curChar == 124)
                     jjstateSet[jjnewStateCnt++] = 53;
                  else if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 44;
                  break;
               case 2:
                  if ((0x100000001000L & l) != 0L && kind > 13)
                     kind = 13;
                  break;
               case 5:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(31, 32);
                  break;
               case 8:
                  if ((0x5000000050L & l) != 0L && kind > 18)
                     kind = 18;
                  break;
               case 10:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAdd(11);
                  break;
               case 12:
                  if (curChar == 92)
                     jjAddStates(33, 35);
                  break;
               case 13:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAdd(11);
                  break;
               case 18:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 19:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 20:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 21:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 22:
                  if ((0x7e0000007eL & l) != 0L)
                     jjCheckNAdd(11);
                  break;
               case 23:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 25:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(10, 13);
                  break;
               case 26:
                  if (curChar == 92)
                     jjAddStates(36, 38);
                  break;
               case 27:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(10, 13);
                  break;
               case 28:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 29:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 30:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 31;
                  break;
               case 31:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 32;
                  break;
               case 32:
                  if ((0x7e0000007eL & l) != 0L)
                     jjCheckNAddStates(10, 13);
                  break;
               case 33:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 40:
                  if (curChar != 110)
                     break;
                  if (kind > 26)
                     kind = 26;
                  jjAddStates(39, 40);
                  break;
               case 41:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 40;
                  break;
               case 42:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 41;
                  break;
               case 43:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 42;
                  break;
               case 44:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 43;
                  break;
               case 45:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 44;
                  break;
               case 46:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 27)
                     kind = 27;
                  jjCheckNAdd(47);
                  break;
               case 48:
                  if ((0x7000000068000000L & l) != 0L && kind > 30)
                     kind = 30;
                  break;
               case 53:
                  if (curChar == 124 && kind > 30)
                     kind = 30;
                  break;
               case 54:
                  if (curChar == 124)
                     jjstateSet[jjnewStateCnt++] = 53;
                  break;
               case 66:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(41, 42);
                  break;
               case 70:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(43, 44);
                  break;
               case 74:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(45, 46);
                  break;
               case 78:
                  if ((0x100000001000000L & l) != 0L)
                     jjCheckNAdd(79);
                  break;
               case 79:
                  if ((0x7e0000007eL & l) == 0L)
                     break;
                  if (kind > 13)
                     kind = 13;
                  jjCheckNAddTwoStates(79, 2);
                  break;
               case 83:
                  if (kind > 7)
                     kind = 7;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 85:
               case 47:
                  if (!jjCanMove_1(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 27)
                     kind = 27;
                  jjCheckNAdd(47);
                  break;
               case 0:
                  if (!jjCanMove_1(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 27)
                     kind = 27;
                  jjCheckNAdd(47);
                  break;
               case 10:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 25:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(10, 13);
                  break;
               case 83:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2) && kind > 7)
                     kind = 7;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 85 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static private final int jjMoveStringLiteralDfa0_3()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_3(0x800L);
      default :
         return 1;
   }
}
static private final int jjMoveStringLiteralDfa1_3(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(1, 11);
         break;
      default :
         return 2;
   }
   return 2;
}
static private final int jjMoveStringLiteralDfa0_1()
{
   return jjMoveNfa_1(0, 0);
}
static private final int jjMoveNfa_1(int startState, int curPos)
{
   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 3;
   int i = 1;
   jjstateSet[0] = startState;
   int j, kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x2400L & l) != 0L)
                  {
                     if (kind > 9)
                        kind = 9;
                  }
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 1:
                  if (curChar == 10 && kind > 9)
                     kind = 9;
                  break;
               case 2:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 3 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static private final int jjMoveStringLiteralDfa0_2()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_2(0x400L);
      default :
         return 1;
   }
}
static private final int jjMoveStringLiteralDfa1_2(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(1, 10);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
   4, 5, 8, 63, 64, 69, 70, 73, 74, 8, 25, 26, 33, 34, 10, 12, 
   23, 78, 80, 2, 25, 26, 36, 33, 34, 65, 66, 8, 73, 74, 8, 6, 
   7, 13, 14, 16, 27, 35, 37, 39, 45, 67, 68, 71, 72, 75, 76, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default : 
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}
private static final boolean jjCanMove_1(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec4[i2] & l2) != 0L);
      case 48:
         return ((jjbitVec5[i2] & l2) != 0L);
      case 49:
         return ((jjbitVec6[i2] & l2) != 0L);
      case 51:
         return ((jjbitVec7[i2] & l2) != 0L);
      case 61:
         return ((jjbitVec8[i2] & l2) != 0L);
      default : 
         if ((jjbitVec3[i1] & l1) != 0L)
            return true;
         return false;
   }
}
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, "\56", "\50", "\51", "\173", 
null, null, null, null, null, "\54", };
public static final String[] lexStateNames = {
   "DEFAULT", 
   "IN_SINGLE_LINE_COMMENT", 
   "IN_FORMAL_COMMENT", 
   "IN_MULTI_LINE_COMMENT", 
};
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, 1, 2, 3, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0xcff42001L, 
};
static final long[] jjtoSkip = {
   0xe3eL, 
};
static final long[] jjtoSpecial = {
   0xe00L, 
};
static final long[] jjtoMore = {
   0x11c0L, 
};
static protected JavaCharStream input_stream;
static private final int[] jjrounds = new int[85];
static private final int[] jjstateSet = new int[170];
static StringBuffer image;
static int jjimageLen;
static int lengthOfMatch;
static protected char curChar;
public CodeScannerTokenManager(JavaCharStream stream)
{
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}
public CodeScannerTokenManager(JavaCharStream stream, int lexState)
{
   this(stream);
   SwitchTo(lexState);
}
static public void ReInit(JavaCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private final void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 85; i-- > 0;)
      jjrounds[i] = 0x80000000;
}
static public void ReInit(JavaCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}
static public void SwitchTo(int lexState)
{
   if (lexState >= 4 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   Token t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   String im = jjstrLiteralImages[jjmatchedKind];
   t.image = (im == null) ? input_stream.GetImage() : im;
   t.beginLine = input_stream.getBeginLine();
   t.beginColumn = input_stream.getBeginColumn();
   t.endLine = input_stream.getEndLine();
   t.endColumn = input_stream.getEndColumn();
   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

public static Token getNextToken() 
{
  int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }
   image = null;
   jjimageLen = 0;

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         try { input_stream.backup(0);
            while (curChar <= 32 && (0x100003600L & (1L << curChar)) != 0L)
               curChar = input_stream.BeginToken();
         }
         catch (java.io.IOException e1) { continue EOFLoop; }
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         if (jjmatchedPos == 0 && jjmatchedKind > 12)
         {
            jjmatchedKind = 12;
         }
         break;
       case 2:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_2();
         if (jjmatchedPos == 0 && jjmatchedKind > 12)
         {
            jjmatchedKind = 12;
         }
         break;
       case 3:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_3();
         if (jjmatchedPos == 0 && jjmatchedKind > 12)
         {
            jjmatchedKind = 12;
         }
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           matchedToken.specialToken = specialToken;
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
           {
              matchedToken = jjFillToken();
              if (specialToken == null)
                 specialToken = matchedToken;
              else
              {
                 matchedToken.specialToken = specialToken;
                 specialToken = (specialToken.next = matchedToken);
              }
              SkipLexicalActions(matchedToken);
           }
           else 
              SkipLexicalActions(null);
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
        MoreLexicalActions();
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
   }
  }
}

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      case 7 :
         if (image == null)
              image = new StringBuffer(new String(input_stream.GetSuffix(jjimageLen)));
         else
            image.append(input_stream.GetSuffix(jjimageLen));
         jjimageLen = 0;
                   input_stream.backup(1);
         break;
      default : 
         break;
   }
}
}