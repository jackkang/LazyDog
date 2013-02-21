//
//  XYZPerson.h
//  LearningObjectiveC
//
//  Created by Jack Kang on 2/21/13.
//  Copyright (c) 2013 Jack Kang. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface XYZPerson : NSObject

@property NSString * firstName;

@property NSString * lastName;

@property NSDate * birthday;

-(NSString *)sayHello:(NSString *)msg;

+(XYZPerson *) person;

@end
