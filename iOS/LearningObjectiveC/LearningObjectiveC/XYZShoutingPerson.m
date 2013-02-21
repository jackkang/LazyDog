//
//  XYZShoutingPerson.m
//  LearningObjectiveC
//
//  Created by Jack Kang on 2/21/13.
//  Copyright (c) 2013 Jack Kang. All rights reserved.
//

#import "XYZShoutingPerson.h"

@implementation XYZShoutingPerson

-(NSString *)sayHello:(NSString *)msg {
    return [NSString stringWithFormat:@"HELLO, %@!!!", msg];
}
@end
