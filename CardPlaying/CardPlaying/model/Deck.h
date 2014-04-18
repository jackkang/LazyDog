//
//  Deck.h
//  CardPlaying
//
//  Created by labuser on 4/16/14.
//
//

#import <Foundation/Foundation.h>
#import "Card.h"

@interface Deck : NSObject
-(void)addCard:(Card *)card atTop:(BOOL)atTop;

-(void)addCard:(Card *)card;

-(Card *)drawRandomCard;

@end
