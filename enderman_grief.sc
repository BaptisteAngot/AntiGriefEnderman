__on_mob_interacts_with_block(mob, block, item_tuple, hand) -> (
    if (mob == 'minecraft:enderman',
        mob.setCarriedBlock(None)
        mob.setCarriedBlockState('minecraft:air')
        return ('cancel')
    )
);
