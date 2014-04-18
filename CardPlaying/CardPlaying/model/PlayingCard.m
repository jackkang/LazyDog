//
//  PlayingCard.m
//  CardPlaying
//
//  Created by labuser on 4/16/14.
//
//

#import "PlayingCard.h"

@implementation PlayingCard

@synthesize suit = _suit;

- (NSString*) contents {
    return [[PlayingCard rankStrings][self.rank] stringByAppendingString:self.suit];
}

-(void) setSuit:(NSString *)suit {
    if ([[PlayingCard validSuits] containsObject:suit]) {
        _suit = suit;
    } else {
        _suit = @"?";
    }
}

-(NSString *)suit {
    return (!_suit) ? @"?" : _suit;
}

-(void)setRank:(NSUInteger)rank {
    if (rank <= [PlayingCard maxRank]) {
        _rank = rank;
    }
}

+(NSArray *)validSuits {
    return @[@"♠️", @"♥️", @"♣️", @"♦️"];
}

+(NSArray *)rankStrings {
    return @[@"?", @"A", @"2", @"3", @"4", @"5", @"6", @"7", @"8", @"9", @"10", @"J", @"Q", @"K"];
}

+(NSUInteger)maxRank {
    return [[PlayingCard rankStrings] count] - 1;
}

@end
