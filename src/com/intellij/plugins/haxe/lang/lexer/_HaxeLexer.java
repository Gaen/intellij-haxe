/* The following code was generated by JFlex 1.4.3 on 2/24/12 3:37 PM */

package com.intellij.plugins.haxe.lang.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import java.util.*;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 2/24/12 3:37 PM from the specification file
 * <tt>C:/workspace/idea/plugins/haxe/src/com/intellij/plugins/haxe/lang/lexer/haxe.flex</tt>
 */
public class _HaxeLexer implements FlexLexer, HaxeTokenTypes, HaxeTokenTypeSets {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\6\1\0\1\1\1\6\22\0\1\1\1\63\1\22"+
    "\1\75\1\0\1\73\1\70\1\20\1\55\1\56\1\5\1\66\1\61"+
    "\1\16\1\17\1\4\1\12\7\11\2\10\1\57\1\60\1\71\1\62"+
    "\1\74\1\65\1\0\4\7\1\15\1\7\21\2\1\14\2\2\1\53"+
    "\1\21\1\54\1\72\1\2\1\0\1\31\1\27\1\41\1\33\1\24"+
    "\1\34\1\42\1\46\1\26\1\2\1\32\1\36\1\45\1\23\1\43"+
    "\1\40\1\2\1\30\1\44\1\37\1\35\1\47\1\25\1\13\1\50"+
    "\1\2\1\51\1\67\1\52\1\64\53\0\1\2\12\0\1\2\4\0"+
    "\1\2\5\0\27\2\1\0\37\2\1\0\u013f\2\31\0\162\2\4\0"+
    "\14\2\16\0\5\2\11\0\1\2\213\0\1\2\13\0\1\2\1\0"+
    "\3\2\1\0\1\2\1\0\24\2\1\0\54\2\1\0\46\2\1\0"+
    "\5\2\4\0\202\2\10\0\105\2\1\0\46\2\2\0\2\2\6\0"+
    "\20\2\41\0\46\2\2\0\1\2\7\0\47\2\110\0\33\2\5\0"+
    "\3\2\56\0\32\2\5\0\13\2\25\0\12\3\4\0\2\2\1\0"+
    "\143\2\1\0\1\2\17\0\2\2\7\0\2\2\12\3\3\2\2\0"+
    "\1\2\20\0\1\2\1\0\36\2\35\0\3\2\60\0\46\2\13\0"+
    "\1\2\u0152\0\66\2\3\0\1\2\22\0\1\2\7\0\12\2\4\0"+
    "\12\3\25\0\10\2\2\0\2\2\2\0\26\2\1\0\7\2\1\0"+
    "\1\2\3\0\4\2\3\0\1\2\36\0\2\2\1\0\3\2\4\0"+
    "\12\3\2\2\23\0\6\2\4\0\2\2\2\0\26\2\1\0\7\2"+
    "\1\0\2\2\1\0\2\2\1\0\2\2\37\0\4\2\1\0\1\2"+
    "\7\0\12\3\2\0\3\2\20\0\11\2\1\0\3\2\1\0\26\2"+
    "\1\0\7\2\1\0\2\2\1\0\5\2\3\0\1\2\22\0\1\2"+
    "\17\0\2\2\4\0\12\3\25\0\10\2\2\0\2\2\2\0\26\2"+
    "\1\0\7\2\1\0\2\2\1\0\5\2\3\0\1\2\36\0\2\2"+
    "\1\0\3\2\4\0\12\3\1\0\1\2\21\0\1\2\1\0\6\2"+
    "\3\0\3\2\1\0\4\2\3\0\2\2\1\0\1\2\1\0\2\2"+
    "\3\0\2\2\3\0\3\2\3\0\10\2\1\0\3\2\55\0\11\3"+
    "\25\0\10\2\1\0\3\2\1\0\27\2\1\0\12\2\1\0\5\2"+
    "\46\0\2\2\4\0\12\3\25\0\10\2\1\0\3\2\1\0\27\2"+
    "\1\0\12\2\1\0\5\2\3\0\1\2\40\0\1\2\1\0\2\2"+
    "\4\0\12\3\25\0\10\2\1\0\3\2\1\0\27\2\1\0\20\2"+
    "\46\0\2\2\4\0\12\3\25\0\22\2\3\0\30\2\1\0\11\2"+
    "\1\0\1\2\2\0\7\2\72\0\60\2\1\0\2\2\14\0\7\2"+
    "\11\0\12\3\47\0\2\2\1\0\1\2\2\0\2\2\1\0\1\2"+
    "\2\0\1\2\6\0\4\2\1\0\7\2\1\0\3\2\1\0\1\2"+
    "\1\0\1\2\2\0\2\2\1\0\4\2\1\0\2\2\11\0\1\2"+
    "\2\0\5\2\1\0\1\2\11\0\12\3\2\0\2\2\42\0\1\2"+
    "\37\0\12\3\26\0\10\2\1\0\42\2\35\0\4\2\164\0\42\2"+
    "\1\0\5\2\1\0\2\2\25\0\12\3\6\0\6\2\112\0\46\2"+
    "\12\0\51\2\7\0\132\2\5\0\104\2\5\0\122\2\6\0\7\2"+
    "\1\0\77\2\1\0\1\2\1\0\4\2\2\0\7\2\1\0\1\2"+
    "\1\0\4\2\2\0\47\2\1\0\1\2\1\0\4\2\2\0\37\2"+
    "\1\0\1\2\1\0\4\2\2\0\7\2\1\0\1\2\1\0\4\2"+
    "\2\0\7\2\1\0\7\2\1\0\27\2\1\0\37\2\1\0\1\2"+
    "\1\0\4\2\2\0\7\2\1\0\47\2\1\0\23\2\16\0\11\3"+
    "\56\0\125\2\14\0\u026c\2\2\0\10\2\12\0\32\2\5\0\113\2"+
    "\25\0\15\2\1\0\4\2\16\0\22\2\16\0\22\2\16\0\15\2"+
    "\1\0\3\2\17\0\64\2\43\0\1\2\4\0\1\2\3\0\12\3"+
    "\46\0\12\3\6\0\130\2\10\0\51\2\127\0\35\2\51\0\12\3"+
    "\36\2\2\0\5\2\u038b\0\154\2\224\0\234\2\4\0\132\2\6\0"+
    "\26\2\2\0\6\2\2\0\46\2\2\0\6\2\2\0\10\2\1\0"+
    "\1\2\1\0\1\2\1\0\1\2\1\0\37\2\2\0\65\2\1\0"+
    "\7\2\1\0\1\2\3\0\3\2\1\0\7\2\3\0\4\2\2\0"+
    "\6\2\4\0\15\2\5\0\3\2\1\0\7\2\164\0\1\2\15\0"+
    "\1\2\202\0\1\2\4\0\1\2\2\0\12\2\1\0\1\2\3\0"+
    "\5\2\6\0\1\2\1\0\1\2\1\0\1\2\1\0\4\2\1\0"+
    "\3\2\1\0\7\2\3\0\3\2\5\0\5\2\u0ebb\0\2\2\52\0"+
    "\5\2\5\0\2\2\4\0\126\2\6\0\3\2\1\0\132\2\1\0"+
    "\4\2\5\0\50\2\4\0\136\2\21\0\30\2\70\0\20\2\u0200\0"+
    "\u19b6\2\112\0\u51a6\2\132\0\u048d\2\u0773\0\u2ba4\2\u215c\0\u012e\2\2\0"+
    "\73\2\225\0\7\2\14\0\5\2\5\0\1\2\1\0\12\2\1\0"+
    "\15\2\1\0\5\2\1\0\1\2\1\0\2\2\1\0\2\2\1\0"+
    "\154\2\41\0\u016b\2\22\0\100\2\2\0\66\2\50\0\14\2\164\0"+
    "\5\2\1\0\207\2\23\0\12\3\7\0\32\2\6\0\32\2\13\0"+
    "\131\2\3\0\6\2\2\0\6\2\2\0\6\2\2\0\3\2\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\1\1\4\1\5\2\6"+
    "\1\7\1\10\1\11\1\12\17\3\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\1\3\0\1\37\1\40\1\41\1\42\1\43"+
    "\1\0\1\44\1\45\1\46\1\0\2\11\2\12\6\3"+
    "\1\47\1\50\4\3\1\51\21\3\1\52\1\53\1\54"+
    "\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
    "\1\65\1\66\3\0\1\46\1\0\1\40\1\67\1\70"+
    "\1\71\1\72\15\3\1\73\1\3\1\74\15\3\1\75"+
    "\1\76\1\77\3\0\1\100\1\0\2\67\1\101\1\3"+
    "\1\102\1\103\13\3\1\104\6\3\1\105\1\106\5\3"+
    "\1\107\2\0\1\40\1\0\1\3\1\110\4\3\1\111"+
    "\5\3\1\112\4\3\1\113\1\114\4\3\1\0\1\115"+
    "\1\3\1\116\2\3\1\117\1\120\3\3\1\121\3\3"+
    "\1\122\2\3\1\123\1\124\1\125\1\0\1\126\2\3"+
    "\1\127\1\130\1\3\1\131\1\132\1\133\2\3\1\134"+
    "\2\3\1\135\1\136\1\137\1\140\1\3\1\141";

  private static int [] zzUnpackAction() {
    int [] result = new int[257];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\76\0\174\0\272\0\370\0\u0136\0\u0174\0\u01b2"+
    "\0\u01f0\0\u022e\0\u026c\0\u02aa\0\u02e8\0\u0326\0\u0364\0\u03a2"+
    "\0\u03e0\0\u041e\0\u045c\0\u049a\0\u04d8\0\u0516\0\u0554\0\u0592"+
    "\0\u05d0\0\u060e\0\u064c\0\u068a\0\76\0\76\0\76\0\76"+
    "\0\76\0\76\0\76\0\76\0\76\0\u06c8\0\u0706\0\76"+
    "\0\76\0\u0744\0\u0782\0\u07c0\0\u07fe\0\u083c\0\u087a\0\u08b8"+
    "\0\u08f6\0\370\0\u0934\0\u0972\0\u09b0\0\u09ee\0\76\0\76"+
    "\0\u0a2c\0\u0a6a\0\76\0\76\0\u0aa8\0\u0ae6\0\76\0\u0b24"+
    "\0\u0b62\0\76\0\u0ba0\0\u0bde\0\u0c1c\0\u0c5a\0\u0c98\0\u0cd6"+
    "\0\u0d14\0\272\0\u0d52\0\u0d90\0\u0dce\0\u0e0c\0\272\0\u0e4a"+
    "\0\u0e88\0\u0ec6\0\u0f04\0\u0f42\0\u0f80\0\u0fbe\0\u0ffc\0\u103a"+
    "\0\u1078\0\u10b6\0\u10f4\0\u1132\0\u1170\0\u11ae\0\u11ec\0\u122a"+
    "\0\76\0\76\0\76\0\76\0\76\0\76\0\76\0\76"+
    "\0\76\0\u1268\0\76\0\76\0\76\0\u12a6\0\u12e4\0\u1322"+
    "\0\u1360\0\u1360\0\u139e\0\u13dc\0\u0a6a\0\76\0\272\0\u141a"+
    "\0\u1458\0\u1496\0\u14d4\0\u1512\0\u1550\0\u158e\0\u15cc\0\u160a"+
    "\0\u1648\0\u1686\0\u16c4\0\u1702\0\272\0\u1740\0\272\0\u177e"+
    "\0\u17bc\0\u17fa\0\u1838\0\u1876\0\u18b4\0\u18f2\0\u1930\0\u196e"+
    "\0\u19ac\0\u19ea\0\u1a28\0\u1a66\0\272\0\76\0\76\0\u1aa4"+
    "\0\u1ae2\0\u1b20\0\76\0\u1b5e\0\u1b9c\0\76\0\272\0\u1bda"+
    "\0\272\0\272\0\u1c18\0\u1c56\0\u1c94\0\u1cd2\0\u1d10\0\u1d4e"+
    "\0\u1d8c\0\u1dca\0\u1e08\0\u1e46\0\u1e84\0\272\0\u1ec2\0\u1f00"+
    "\0\u1f3e\0\u1f7c\0\u1fba\0\u1ff8\0\272\0\272\0\u2036\0\u2074"+
    "\0\u20b2\0\u20f0\0\u212e\0\76\0\u216c\0\u21aa\0\76\0\u21e8"+
    "\0\u2226\0\272\0\u2264\0\u22a2\0\u22e0\0\u231e\0\272\0\u235c"+
    "\0\u239a\0\u23d8\0\u2416\0\u2454\0\272\0\u2492\0\u24d0\0\u250e"+
    "\0\u254c\0\272\0\272\0\u258a\0\u25c8\0\u2606\0\u2644\0\u2682"+
    "\0\u26c0\0\u26fe\0\272\0\u273c\0\u277a\0\272\0\272\0\u27b8"+
    "\0\u27f6\0\u2834\0\272\0\u2872\0\u28b0\0\u28ee\0\272\0\u292c"+
    "\0\u296a\0\272\0\272\0\76\0\u29a8\0\272\0\u29e6\0\u2a24"+
    "\0\272\0\272\0\u2a62\0\272\0\272\0\272\0\u2aa0\0\u2ade"+
    "\0\76\0\u2b1c\0\u2b5a\0\272\0\272\0\272\0\272\0\u2b98"+
    "\0\272";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[257];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\3\1\4"+
    "\2\10\1\11\3\4\1\12\1\13\1\14\1\2\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\2\4\1\24"+
    "\1\25\1\26\1\4\1\27\1\30\1\31\1\4\1\32"+
    "\1\33\2\4\1\34\1\4\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50"+
    "\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60"+
    "\1\61\77\0\1\3\4\0\1\3\71\0\2\4\3\0"+
    "\7\4\5\0\26\4\30\0\1\62\4\0\3\62\2\0"+
    "\1\63\1\0\1\64\4\0\1\63\55\0\1\65\1\66"+
    "\54\0\1\67\75\0\1\70\16\0\1\62\4\0\3\10"+
    "\2\0\1\63\1\0\1\64\4\0\1\63\54\0\1\62"+
    "\4\0\1\62\2\71\2\72\1\63\1\0\1\64\4\0"+
    "\1\63\67\0\1\73\43\0\1\74\16\0\1\75\4\0"+
    "\3\75\4\0\1\76\56\0\6\14\1\0\11\14\1\77"+
    "\1\100\54\14\6\15\1\0\12\15\1\101\1\102\53\15"+
    "\2\0\2\4\3\0\7\4\5\0\1\4\1\103\10\4"+
    "\1\104\13\4\27\0\2\4\3\0\4\4\1\105\2\4"+
    "\5\0\1\106\12\4\1\107\12\4\27\0\2\4\3\0"+
    "\7\4\5\0\23\4\1\110\2\4\27\0\2\4\3\0"+
    "\7\4\5\0\1\111\10\4\1\112\10\4\1\113\3\4"+
    "\27\0\2\4\3\0\7\4\5\0\5\4\1\114\20\4"+
    "\27\0\2\4\3\0\7\4\5\0\1\4\1\115\24\4"+
    "\27\0\2\4\3\0\7\4\5\0\1\4\1\116\16\4"+
    "\1\117\4\4\1\120\27\0\2\4\3\0\7\4\5\0"+
    "\12\4\1\121\5\4\1\122\5\4\27\0\2\4\3\0"+
    "\7\4\5\0\1\123\25\4\27\0\2\4\3\0\7\4"+
    "\5\0\5\4\1\124\15\4\1\125\1\4\1\126\27\0"+
    "\2\4\3\0\7\4\5\0\5\4\1\127\1\130\3\4"+
    "\1\131\13\4\27\0\2\4\3\0\7\4\5\0\6\4"+
    "\1\132\4\4\1\133\4\4\1\134\5\4\27\0\2\4"+
    "\3\0\7\4\5\0\24\4\1\135\1\4\27\0\2\4"+
    "\3\0\7\4\5\0\2\4\1\136\11\4\1\137\11\4"+
    "\27\0\2\4\3\0\7\4\5\0\6\4\1\140\17\4"+
    "\107\0\1\141\75\0\1\142\75\0\1\143\3\0\1\144"+
    "\71\0\1\145\4\0\1\146\70\0\1\147\5\0\1\150"+
    "\67\0\1\151\6\0\1\152\66\0\1\153\75\0\1\154"+
    "\75\0\1\155\11\0\1\156\25\0\1\157\1\0\1\160"+
    "\52\0\1\161\4\0\3\161\3\0\1\162\47\0\1\162"+
    "\12\0\1\75\4\0\3\75\63\0\6\65\1\0\67\65"+
    "\5\163\1\164\70\163\3\0\1\62\4\0\1\62\2\71"+
    "\2\0\1\63\1\0\1\64\4\0\1\63\60\0\4\165"+
    "\2\0\1\165\6\0\1\165\2\0\1\165\1\0\1\165"+
    "\1\0\2\165\4\0\1\165\37\0\1\75\4\0\3\75"+
    "\2\0\1\63\6\0\1\63\70\0\1\166\56\0\6\14"+
    "\1\0\67\14\6\15\1\0\67\15\2\0\2\4\3\0"+
    "\7\4\5\0\2\4\1\167\23\4\27\0\2\4\3\0"+
    "\7\4\5\0\13\4\1\170\12\4\27\0\2\4\3\0"+
    "\7\4\5\0\14\4\1\171\11\4\27\0\2\4\3\0"+
    "\7\4\5\0\12\4\1\172\13\4\27\0\2\4\3\0"+
    "\7\4\5\0\21\4\1\173\4\4\27\0\2\4\3\0"+
    "\7\4\5\0\3\4\1\174\22\4\27\0\2\4\3\0"+
    "\7\4\5\0\13\4\1\175\1\176\11\4\27\0\2\4"+
    "\3\0\7\4\5\0\15\4\1\177\10\4\27\0\2\4"+
    "\3\0\7\4\5\0\1\4\1\200\24\4\27\0\2\4"+
    "\3\0\7\4\5\0\14\4\1\201\11\4\27\0\2\4"+
    "\3\0\7\4\5\0\11\4\1\202\14\4\27\0\2\4"+
    "\3\0\7\4\5\0\1\203\25\4\27\0\2\4\3\0"+
    "\7\4\5\0\1\204\25\4\27\0\2\4\3\0\7\4"+
    "\5\0\5\4\1\205\20\4\27\0\2\4\3\0\7\4"+
    "\5\0\14\4\1\206\11\4\27\0\2\4\3\0\7\4"+
    "\5\0\25\4\1\207\27\0\2\4\3\0\7\4\5\0"+
    "\3\4\1\210\1\4\1\211\20\4\27\0\2\4\3\0"+
    "\7\4\5\0\15\4\1\212\10\4\27\0\2\4\3\0"+
    "\7\4\5\0\3\4\1\213\22\4\27\0\2\4\3\0"+
    "\7\4\5\0\16\4\1\214\7\4\27\0\2\4\3\0"+
    "\7\4\5\0\4\4\1\215\21\4\27\0\2\4\3\0"+
    "\7\4\5\0\14\4\1\216\4\4\1\217\4\4\27\0"+
    "\2\4\3\0\7\4\5\0\6\4\1\220\17\4\27\0"+
    "\2\4\3\0\7\4\5\0\1\221\25\4\27\0\2\4"+
    "\3\0\7\4\5\0\1\4\1\222\24\4\27\0\2\4"+
    "\3\0\7\4\5\0\3\4\1\223\22\4\27\0\2\4"+
    "\3\0\7\4\5\0\6\4\1\224\17\4\27\0\2\4"+
    "\3\0\7\4\5\0\5\4\1\225\20\4\107\0\1\226"+
    "\75\0\1\227\36\0\1\230\4\0\1\231\5\0\1\232"+
    "\73\0\1\233\44\0\1\161\4\0\3\161\63\0\5\163"+
    "\1\234\70\163\4\235\1\236\1\164\70\235\2\0\2\4"+
    "\3\0\7\4\5\0\13\4\1\237\12\4\27\0\2\4"+
    "\3\0\7\4\5\0\1\4\1\240\24\4\27\0\2\4"+
    "\3\0\7\4\5\0\22\4\1\241\3\4\27\0\2\4"+
    "\3\0\7\4\5\0\1\4\1\242\24\4\27\0\2\4"+
    "\3\0\7\4\5\0\13\4\1\243\12\4\27\0\2\4"+
    "\3\0\7\4\5\0\3\4\1\244\22\4\27\0\2\4"+
    "\3\0\7\4\5\0\1\4\1\245\24\4\27\0\2\4"+
    "\3\0\7\4\5\0\13\4\1\246\4\4\1\247\5\4"+
    "\27\0\2\4\3\0\7\4\5\0\6\4\1\250\17\4"+
    "\27\0\2\4\3\0\7\4\5\0\12\4\1\251\13\4"+
    "\27\0\2\4\3\0\7\4\5\0\6\4\1\252\17\4"+
    "\27\0\2\4\3\0\7\4\5\0\6\4\1\253\17\4"+
    "\27\0\2\4\3\0\7\4\5\0\16\4\1\254\7\4"+
    "\27\0\2\4\3\0\7\4\5\0\25\4\1\255\27\0"+
    "\2\4\3\0\7\4\5\0\21\4\1\256\4\4\27\0"+
    "\2\4\3\0\7\4\5\0\20\4\1\257\5\4\27\0"+
    "\2\4\3\0\7\4\5\0\1\4\1\260\24\4\27\0"+
    "\2\4\3\0\7\4\5\0\24\4\1\261\1\4\27\0"+
    "\2\4\3\0\7\4\5\0\7\4\1\262\16\4\27\0"+
    "\2\4\3\0\7\4\5\0\13\4\1\263\12\4\27\0"+
    "\2\4\3\0\7\4\5\0\16\4\1\264\7\4\27\0"+
    "\2\4\3\0\7\4\5\0\1\4\1\265\12\4\1\266"+
    "\11\4\27\0\2\4\3\0\7\4\5\0\21\4\1\267"+
    "\4\4\27\0\2\4\3\0\7\4\5\0\14\4\1\270"+
    "\11\4\27\0\2\4\3\0\7\4\5\0\5\4\1\271"+
    "\20\4\27\0\2\4\3\0\7\4\5\0\14\4\1\272"+
    "\11\4\27\0\2\4\3\0\7\4\5\0\14\4\1\273"+
    "\11\4\60\0\1\274\72\0\1\275\111\0\1\276\31\0"+
    "\4\163\1\277\1\234\70\163\5\235\1\300\70\235\2\0"+
    "\2\4\3\0\7\4\5\0\1\301\25\4\27\0\2\4"+
    "\3\0\7\4\5\0\1\4\1\302\24\4\27\0\2\4"+
    "\3\0\7\4\5\0\1\303\25\4\27\0\2\4\3\0"+
    "\7\4\5\0\5\4\1\304\20\4\27\0\2\4\3\0"+
    "\7\4\5\0\1\4\1\305\24\4\27\0\2\4\3\0"+
    "\7\4\5\0\5\4\1\306\20\4\27\0\2\4\3\0"+
    "\7\4\5\0\7\4\1\307\16\4\27\0\2\4\3\0"+
    "\7\4\5\0\5\4\1\310\20\4\27\0\2\4\3\0"+
    "\7\4\5\0\12\4\1\311\13\4\27\0\2\4\3\0"+
    "\7\4\5\0\22\4\1\312\3\4\27\0\2\4\3\0"+
    "\7\4\5\0\14\4\1\313\11\4\27\0\2\4\3\0"+
    "\7\4\5\0\15\4\1\314\10\4\27\0\2\4\3\0"+
    "\7\4\5\0\2\4\1\315\23\4\27\0\2\4\3\0"+
    "\7\4\5\0\10\4\1\316\15\4\27\0\2\4\3\0"+
    "\7\4\5\0\6\4\1\317\17\4\27\0\2\4\3\0"+
    "\7\4\5\0\6\4\1\320\17\4\27\0\2\4\3\0"+
    "\7\4\5\0\3\4\1\321\22\4\27\0\2\4\3\0"+
    "\7\4\5\0\23\4\1\322\2\4\27\0\2\4\3\0"+
    "\7\4\5\0\21\4\1\323\4\4\27\0\2\4\3\0"+
    "\7\4\5\0\3\4\1\324\22\4\27\0\2\4\3\0"+
    "\7\4\5\0\5\4\1\325\20\4\27\0\2\4\3\0"+
    "\7\4\5\0\16\4\1\326\7\4\27\0\2\4\3\0"+
    "\7\4\5\0\3\4\1\327\22\4\70\0\1\330\56\0"+
    "\1\331\51\0\4\235\1\236\1\300\70\235\2\0\2\4"+
    "\3\0\7\4\5\0\10\4\1\332\15\4\27\0\2\4"+
    "\3\0\7\4\5\0\1\4\1\333\24\4\27\0\2\4"+
    "\3\0\7\4\5\0\11\4\1\334\14\4\27\0\2\4"+
    "\3\0\7\4\5\0\22\4\1\335\3\4\27\0\2\4"+
    "\3\0\7\4\5\0\14\4\1\336\11\4\27\0\2\4"+
    "\3\0\7\4\5\0\1\337\25\4\27\0\2\4\3\0"+
    "\7\4\5\0\13\4\1\340\12\4\27\0\2\4\3\0"+
    "\7\4\5\0\3\4\1\341\22\4\27\0\2\4\3\0"+
    "\7\4\5\0\3\4\1\342\22\4\27\0\2\4\3\0"+
    "\7\4\5\0\1\4\1\343\24\4\27\0\2\4\3\0"+
    "\7\4\5\0\1\4\1\344\24\4\27\0\2\4\3\0"+
    "\7\4\5\0\14\4\1\345\11\4\27\0\2\4\3\0"+
    "\7\4\5\0\17\4\1\346\6\4\27\0\2\4\3\0"+
    "\7\4\5\0\16\4\1\347\7\4\27\0\2\4\3\0"+
    "\7\4\5\0\1\350\25\4\27\0\2\4\3\0\7\4"+
    "\5\0\3\4\1\351\22\4\27\0\2\4\3\0\7\4"+
    "\5\0\23\4\1\352\2\4\27\0\2\4\3\0\7\4"+
    "\5\0\16\4\1\353\7\4\55\0\1\354\73\0\1\355"+
    "\51\0\2\4\3\0\7\4\5\0\21\4\1\356\4\4"+
    "\27\0\2\4\3\0\7\4\5\0\6\4\1\357\17\4"+
    "\27\0\2\4\3\0\7\4\5\0\1\4\1\360\24\4"+
    "\27\0\2\4\3\0\7\4\5\0\14\4\1\361\11\4"+
    "\27\0\2\4\3\0\7\4\5\0\16\4\1\362\7\4"+
    "\27\0\2\4\3\0\7\4\5\0\20\4\1\363\5\4"+
    "\27\0\2\4\3\0\7\4\5\0\11\4\1\364\14\4"+
    "\27\0\2\4\3\0\7\4\5\0\1\4\1\365\24\4"+
    "\27\0\2\4\3\0\7\4\5\0\1\4\1\366\24\4"+
    "\27\0\2\4\3\0\7\4\5\0\12\4\1\367\13\4"+
    "\27\0\2\4\3\0\7\4\5\0\10\4\1\370\15\4"+
    "\61\0\1\371\43\0\2\4\3\0\7\4\5\0\16\4"+
    "\1\372\7\4\27\0\2\4\3\0\7\4\5\0\1\373"+
    "\25\4\27\0\2\4\3\0\7\4\5\0\1\374\25\4"+
    "\27\0\2\4\3\0\7\4\5\0\1\4\1\375\24\4"+
    "\27\0\2\4\3\0\7\4\5\0\1\4\1\376\24\4"+
    "\27\0\2\4\3\0\7\4\5\0\1\4\1\377\24\4"+
    "\27\0\2\4\3\0\7\4\5\0\14\4\1\u0100\11\4"+
    "\27\0\2\4\3\0\7\4\5\0\21\4\1\u0101\4\4"+
    "\25\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[11222];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\32\1\11\11\2\1\2\11\10\1\3\0"+
    "\2\1\2\11\1\1\1\0\2\11\1\1\1\0\1\11"+
    "\2\1\1\11\36\1\11\11\1\1\3\11\3\0\1\1"+
    "\1\0\3\1\1\11\37\1\2\11\3\0\1\11\1\0"+
    "\1\1\1\11\35\1\1\11\2\0\1\11\1\0\27\1"+
    "\1\0\23\1\1\11\1\0\13\1\1\11\10\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[257];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  public _HaxeLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public _HaxeLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1320) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 40: 
          { return KIF ;
          }
        case 98: break;
        case 7: 
          { return OMINUS;
          }
        case 99: break;
        case 22: 
          { return OCOMPLEMENT;
          }
        case 100: break;
        case 83: 
          { return KSWITCH ;
          }
        case 101: break;
        case 32: 
          { return MML_COMMENT;
          }
        case 102: break;
        case 26: 
          { return OBIT_AND;
          }
        case 103: break;
        case 23: 
          { return OQUEST;
          }
        case 104: break;
        case 10: 
          { return LITSTRING;
          }
        case 105: break;
        case 4: 
          { return OQUOTIENT;
          }
        case 106: break;
        case 95: 
          { return KOVERRIDE;
          }
        case 107: break;
        case 70: 
          { return( KCAST );
          }
        case 108: break;
        case 47: 
          { return OCOND_OR;
          }
        case 109: break;
        case 74: 
          { return KTHROW ;
          }
        case 110: break;
        case 3: 
          { return ID;
          }
        case 111: break;
        case 46: 
          { return OBIT_OR_ASSIGN;
          }
        case 112: break;
        case 33: 
          { return OQUOTIENT_ASSIGN;
          }
        case 113: break;
        case 51: 
          { return OSHIFT_LEFT;
          }
        case 114: break;
        case 79: 
          { return KIMPORT ;
          }
        case 115: break;
        case 65: 
          { return KNULL ;
          }
        case 116: break;
        case 86: 
          { return( KEXTENDS );
          }
        case 117: break;
        case 66: 
          { return( KENUM );
          }
        case 118: break;
        case 14: 
          { return PRBRACK;
          }
        case 119: break;
        case 1: 
          { yybegin(YYINITIAL); return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 120: break;
        case 13: 
          { return PLBRACK;
          }
        case 121: break;
        case 75: 
          { return KCATCH;
          }
        case 122: break;
        case 78: 
          { return KINLINE;
          }
        case 123: break;
        case 91: 
          { return( KPACKAGE );
          }
        case 124: break;
        case 84: 
          { return KSTATIC;
          }
        case 125: break;
        case 68: 
          { return KTHIS ;
          }
        case 126: break;
        case 97: 
          { return( KIMPLEMENTS );
          }
        case 127: break;
        case 2: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 128: break;
        case 96: 
          { return( KINTERFACE );
          }
        case 129: break;
        case 44: 
          { return OPLUS_ASSIGN;
          }
        case 130: break;
        case 28: 
          { return OBIT_XOR;
          }
        case 131: break;
        case 45: 
          { return OPLUS_PLUS;
          }
        case 132: break;
        case 53: 
          { return OREMAINDER_ASSIGN;
          }
        case 133: break;
        case 35: 
          { return LITOCT;
          }
        case 134: break;
        case 17: 
          { return OCOLON;
          }
        case 135: break;
        case 62: 
          { return OSHIFT_LEFT_ASSIGN;
          }
        case 136: break;
        case 77: 
          { return PPELSE;
          }
        case 137: break;
        case 50: 
          { return OLESS_OR_EQUAL;
          }
        case 138: break;
        case 31: 
          { return MSL_COMMENT;
          }
        case 139: break;
        case 61: 
          { return KVAR;
          }
        case 140: break;
        case 8: 
          { return ODOT;
          }
        case 141: break;
        case 37: 
          { return OMINUS_ASSIGN;
          }
        case 142: break;
        case 71: 
          { return PPEND;
          }
        case 143: break;
        case 27: 
          { return OLESS;
          }
        case 144: break;
        case 56: 
          { return LITHEX;
          }
        case 145: break;
        case 38: 
          { return LITFLOAT;
          }
        case 146: break;
        case 80: 
          { return KRETURN ;
          }
        case 147: break;
        case 16: 
          { return PRPAREN;
          }
        case 148: break;
        case 58: 
          { return ONEW;
          }
        case 149: break;
        case 36: 
          { return OMINUS_MINUS;
          }
        case 150: break;
        case 15: 
          { return PLPAREN;
          }
        case 151: break;
        case 82: 
          { return KPUBLIC;
          }
        case 152: break;
        case 59: 
          { return KFOR ;
          }
        case 153: break;
        case 25: 
          { return OBIT_OR;
          }
        case 154: break;
        case 88: 
          { return KDYNAMIC;
          }
        case 155: break;
        case 87: 
          { return( KDEFAULT );
          }
        case 156: break;
        case 30: 
          { return OGREATER;
          }
        case 157: break;
        case 19: 
          { return OCOMMA;
          }
        case 158: break;
        case 93: 
          { return( KFUNCTION );
          }
        case 159: break;
        case 9: 
          { return LITCHAR;
          }
        case 160: break;
        case 42: 
          { return OEQ;
          }
        case 161: break;
        case 41: 
          { return KDO ;
          }
        case 162: break;
        case 90: 
          { return KPRIVATE;
          }
        case 163: break;
        case 63: 
          { return OSHIFT_RIGHT_ASSIGN;
          }
        case 164: break;
        case 21: 
          { return ONOT;
          }
        case 165: break;
        case 12: 
          { return PRCURLY;
          }
        case 166: break;
        case 60: 
          { return KTRY;
          }
        case 167: break;
        case 92: 
          { return PPELSEIF;
          }
        case 168: break;
        case 69: 
          { return( KCASE );
          }
        case 169: break;
        case 11: 
          { return PLCURLY;
          }
        case 170: break;
        case 76: 
          { return( KCLASS );
          }
        case 171: break;
        case 20: 
          { return OASSIGN;
          }
        case 172: break;
        case 54: 
          { return OGREATER_OR_EQUAL;
          }
        case 173: break;
        case 5: 
          { return OMUL;
          }
        case 174: break;
        case 49: 
          { return OCOND_AND;
          }
        case 175: break;
        case 43: 
          { return ONOT_EQ;
          }
        case 176: break;
        case 72: 
          { return KWHILE ;
          }
        case 177: break;
        case 48: 
          { return OBIT_AND_ASSIGN;
          }
        case 178: break;
        case 24: 
          { return OPLUS;
          }
        case 179: break;
        case 67: 
          { return KELSE ;
          }
        case 180: break;
        case 6: 
          { return LITINT;
          }
        case 181: break;
        case 55: 
          { return DOC_COMMENT;
          }
        case 182: break;
        case 94: 
          { return KCONTINUE ;
          }
        case 183: break;
        case 81: 
          { return KUNTYPE;
          }
        case 184: break;
        case 73: 
          { return( KBREAK );
          }
        case 185: break;
        case 18: 
          { return OSEMI;
          }
        case 186: break;
        case 29: 
          { return OREMAINDER;
          }
        case 187: break;
        case 34: 
          { return OMUL_ASSIGN;
          }
        case 188: break;
        case 39: 
          { return OIN;
          }
        case 189: break;
        case 89: 
          { return KTYPEDEF;
          }
        case 190: break;
        case 85: 
          { return PPERROR;
          }
        case 191: break;
        case 52: 
          { return OBIT_XOR_ASSIGN;
          }
        case 192: break;
        case 57: 
          { return OTRIPLE_DOT;
          }
        case 193: break;
        case 64: 
          { return PPIF;
          }
        case 194: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
