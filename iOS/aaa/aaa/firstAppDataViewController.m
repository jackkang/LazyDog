//
//  firstAppDataViewController.m
//  aaa
//
//  Created by Jack Kang on 5/23/13.
//  Copyright (c) 2013 Jack Kang. All rights reserved.
//

#import "firstAppDataViewController.h"

@interface firstAppDataViewController ()

@end

@implementation firstAppDataViewController

- (void)viewDidLoad
{
    [super viewDidLoad];
	// Do any additional setup after loading the view, typically from a nib.
}

- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

- (void)viewWillAppear:(BOOL)animated
{
    [super viewWillAppear:animated];
    self.dataLabel.text = [self.dataObject description];
}

@end
