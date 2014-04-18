//
//  Card.h
//  CardPlaying
//
//  Created by labuser on 4/15/14.
//
//

@import Foundation;

@interface Card : NSObject

@property (strong, nonatomic) NSString *contents;

@property (nonatomic, getter = isChosen) BOOL chosen;

@property (nonatomic, getter = isMatched) BOOL matched;

-(int)match:(NSArray *)otherCards;

@end
