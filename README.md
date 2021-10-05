# Shopping-System

There are two microservices built productservice and couponservice.
When customers shop and if they have any coupon, they can apply and the discount will be deducted. In the background, productservice will hit couponservice using resttemplate and reduces the price of product.

Deployed these microservices in AWS using Elastic Beanstalk and database used is RDS which orchestrates EC2, S3 and takes care of autoscaling and load balancing.
