//
//  PlayingCard.h
//  CardPlaying
//
//  Created by labuser on 4/16/14.
//
//

#import "Card.h"

@interface PlayingCard : Card

@property (strong, nonatomic) NSString *suit;

@property (nonatomic) NSUInteger rank;

+(NSArray *) validSuits;

+(NSUInteger) maxRank;

@end
