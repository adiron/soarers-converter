# basic layer example - cursors on r.h. home position when caps lock is held

# define that FN1 accesses layer 1
layerblock
	FN1 1
endblock

# the layer itself is just some remaps tagged with the layer number
# VIM keys layer
remapblock
layer 1
	H LEFT
	J DOWN
	K UP
	L RIGHT
    RALT RGUI
    LALT LGUI
    PAGE_UP MEDIA_VOLUME_UP
    PAGE_DOWN MEDIA_VOLUME_DOWN
endblock

# need to map the FN key into the base layer (0)
remapblock
layer 0
	EUROPE_2 FN1
endblock

