require 'spec_helper'
require 'json'

describe 'QueryApi' do
  before do
    @api_instance = FeverClient::QueryApi.new
  end

  after do
  end

  describe 'test an instance of QueryApi' do
    it 'should create an instance of QueryApi' do
      expect(@api_instance).to be_instance_of(FeverClient::QueryApi)
    end
  end

  describe 'query test' do
    it 'should work' do
    end
  end

end
