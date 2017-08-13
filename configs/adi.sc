include legacy.sc

remapblock
  F13 CAPS_LOCK
  CAPS_LOCK ESC
  F23 PRINTSCREEN
  F24 SCROLL_LOCK 
  LANG_4 EXTRA_SYSRQ

  EXTRA_SYSRQ PAD_MINUS
  SCROLL_LOCK PAD_ASTERIX
  PAD_ASTERIX TAB
  PAD_MINUS PAD_PLUS
  NUM_LOCK PAD_SLASH
  ESC NUM_LOCK
endblock

macroblock
    macro NUM_LOCK LSHIFT
        BOOT
    endmacro
endblock

include "layer adi.sc"

