//
//  Card.m
//  CardPlaying
//
//  Created by labuser on 4/15/14.
//
//

#import "Card.h"

@interface Card()

@end

@implementation Card

-(int)match:(NSArray *)cards {
    int score = 0;
    
    for (Card *card in cards) {
        if ([self.contents isEqualToString:card.contents]) {
            score = 1;
            break;
        }
    }
    
    return score;
}

@end